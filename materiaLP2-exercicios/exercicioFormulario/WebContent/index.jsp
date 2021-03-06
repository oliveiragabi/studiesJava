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
		
			<form action="resultado.jsp" method="post">
				<table class="tabela">
					<tr>
						<td>Nome:</td>
						<td><input type="text" name="nome" value="<%= formulario.getNome() %>"/></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><input type="text" name="email" value="<%= formulario.getEmail() %>"/></td>
					</tr>
					<tr>
						<td>Telefone:</td>
						<td><input type="text" name="telefone" value="<%= formulario.getTelefone() %>"/></td>
					</tr>
					<tr>
						<td>Intagram:</td>
						<td><input type="text" name="instagram" value="<%= formulario.getInstagram() %>"/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="CADASTRAR"/></td>
					</tr>
					<% if( formulario.getEmbranco().equals(true) ){ %>
						<tr>
							<td colspan="2" class="erro">PREENCHER TODOS CAMPOS</td>
						</tr>					
					<% }%>
				</table>			
			</form>
			
			
		</div>
		<div class="rodape">
		
		</div>
	</div>
</body>
</html>