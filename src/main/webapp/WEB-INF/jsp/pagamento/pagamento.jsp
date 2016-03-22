<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home page</title>
</head>
<body>

	<div>
		<ul>
			<c:forEach items="${errors}" var="erro">
				<li>${erro.category} - ${erro.message}</li>
			</c:forEach>
		</ul>

	</div>
	Dynamic content => ${msg}
	<form action="/pagamento/efetua" method="post">
		<fieldset>
			<div>
				<label>
					Numero:
					<input name="cartao.numero" />
				</label>
			</div>
			<div>
				<label>
					Bandeira:
					<input name="cartao.bandeira" />
				</label>
			</div>
			<div>
				<label>
					CVV:
					<input name="cartao.cvv" />
				</label>
			</div>
			<div>
				<label>
					Nome:
					<input name="usuario.nome" />
				</label>
			<div>
			</div>
				<label>
					email:
					<input name="usuario.email" />
				</label>
			</div>
			<input type="submit" value="Salvar"/>
		</fieldset>
	</form>
 
</body>
</html>