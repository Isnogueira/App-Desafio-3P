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
        <div class="alert alert-success alert-dismissible">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>Informação!</strong> ${mensagem}
        </div>
    </c:if>
    <c:if test="${not empty filmes}">
        <div class="container">
            <h2>Bem vindo(a) ${user.nome}</h2>
        </div>
        <br>
        <h2>Listagem de filmes: ${filmes.size()}</h2>
        <div class="container">
          <form action="/time/ordenar" method="post">
            <div class="input-group">
              <select name="sortBy" class="form-control">
                <option value="nome">Titulo</option>
                <option value="genero">Genero</option>
              </select>
              <div class="input-group-btn">
                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-sort-by-alphabet"></i></button>
              </div>
            </div>
          </form>
        </div>
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
                            <td><a href="/filme/${filme.id}/consultar">Detalhes</a></td>
                          </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="container">
                     <a href="/filme/cadastro" class="btn btn-default btn-lg">Incluir</a>
            </div>
    </c:if>
    <c:if test="${empty filmes}">
        <div class="container">
            <h2>Bem vindo(a) ${user.nome}</h2>
        </div>
        <br>
         <div class="container">
            <h3>Não existem filmes cadastrados!</h3>
             <a href="/filme/cadastro" class="btn btn-default btn-lg">Incluir</a>
         </div>
    </c:if>
 </div>
 <c:import url="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>