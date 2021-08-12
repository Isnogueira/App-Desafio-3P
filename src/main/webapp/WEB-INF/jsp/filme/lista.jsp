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
<div class="container">
    <c:if test="${not empty mensagem}">
        <div class="alert alert-info">
          <strong>Info!</strong> ${mensagem}
        </div>
    </c:if>
    <c:if test="${not empty filmes}">
        <h3>
            Quantidade de filmes: ${filmes.size()} |
            <a href="/filme/cadastro">Incluir</a>
        </h3>
        <table class="table table-striped">
            <thead>
              <tr>
                <th>ID</th>
                <th>Título</th>
                <th>Genero</th>
                <th></th>
              </tr>
            </thead>
            <tbody>
                <c:forEach var="filme" items="${filmes}" varStatus="id">
                      <tr>
                        <td>${filme.id}</td>
                        <td>${filme.nome}</td>
                        <td>${filme.genero}</td>
                        <td><a href="/filme/${filme.id}/excluir">Excluir</a></td>
                        <td><a href="/filme/consultar">Detalhes</a></td>
                      </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
    <c:if test="${empty filmes}">
         <div class="container">
            <h3>Não existem filmes cadastrados!</h3>
            <a href="/filme/cadastro">Incluir</a>
         </div>
     </c:if>
</div>
 <c:import url="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>