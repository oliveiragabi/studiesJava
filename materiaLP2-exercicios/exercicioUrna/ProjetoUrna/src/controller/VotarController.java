package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.VotarBean;
import model.Maravilha;

public class VotarController {

	private static final long serialVersionUID = 1L;
	
	public VotarController() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		VotarBean votarbean = (VotarBean) session.getAttribute("votarbean");
		String temp = request.getParameter("selecao");
		
		for(Maravilha m: votarbean.getLista())
			if(m.getDescricao().equals(temp)) {
				int valor = m.getVotos();
				valor++;
				m.setVotos(valor);
				
			}
		response.sendRedirect("index.jsp");
	}
}

