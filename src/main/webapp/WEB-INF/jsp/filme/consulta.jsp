<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>My Flix</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container text-center">
    <h2>Consulta filmes</h2>
</div>
<form action="/filme/incluir" method="post">
    <c:if test="${not empty mensagem}">
        <div class="alert alert-success">
          <strong>Sucesso!</strong> ${mensagem}
        </div>
    </c:if>
   <div class="container">
    <h3>Em construção</h3>
   </div>
</form>
 <c:import url="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>