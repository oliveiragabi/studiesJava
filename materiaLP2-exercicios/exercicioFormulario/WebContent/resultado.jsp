<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>
<%@ page import="bean.Formulario" %>

<jsp:useBean id="formulario" class="bean.Formulario" scope="session" />

<!doctype html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/index.css" >
<title>Insert title here</title>
</head>
<body>

<div class="areatrabalho">
		
		<%
			LocalDate hoje = LocalDate.now();		
		%>
		
		<div class="cabecario">
			<div class="cabecario-barra"> 
				<%= hoje.getDayOfMonth() %> de <%= hoje.getMonth() %> de <%= hoje.getYear() %>
			</div>
		</div>
		
		<div class="corpo">
		
			<%
			
				String nome = request.getParameter("nome");
				String email = request.getParameter("email");
				String telefone = request.getParameter("telefone");
				String instagram = request.getParameter("instagram");
				
				if( nome.isEmpty() || email.isEmpty() || telefone.isEmpty() || instagram.isEmpty() ){
					
					Formulario f = (Formulario) session.getAttribute("formulario");
					
					f.setNome(nome);
					f.setEmail( email );
					f.setTelefone( telefone );
					f.setInstagram( instagram );
					
					f.setEmbranco( true );
					
					response.sendRedirect("index.jsp");
				}
							
			%>
		
			<div><h1>CADASTRO COM SUCESSO</h1></div>
			
		</div>
		<div class="rodape">
		
		</div>
	</div>
</body>
</html>