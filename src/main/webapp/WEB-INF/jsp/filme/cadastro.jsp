<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>Consultar filmes</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<c:set var = "titulo" value="Cadastro de filmes"/>
<c:set var = "rota" value="/filme/incluir"/>
<c:set var = "metodo" value="post"/>
<c:set var = "botao" value="Cadastrar"/>

<c:if test="${not empty filme}">
    <c:set var = "titulo" value="Consulta de filmes"/>
    <c:set var = "rota" value="/voltar"/>
    <c:set var = "metodo" value="get"/>
    <c:set var = "botao" value="Voltar"/>
</c:if>

<div class="container text-center">
    <h2>${titulo}</h2>
</div>
<form action="${rota}" method="${metodo}">
    <c:if test="${not empty mensagem}">
        <div class="alert alert-success">
          <strong>Sucesso!</strong> ${mensagem}
        </div>
    </c:if>
    <div class="container">
        <label for="nome">Nome:</label>
        <input type="text" class="form-control" value="${filme.nome}" id="nome" name="nome">
    </div>
    <br>
    <div class="container">
        <label for="genero">Genero:</label>
        <input type="text" class="form-control" value="${filme.genero}" id="genero" name="genero">
    </div>
    <br>
    </div>
    <div class="container">
        <label for="diretor">Direção:</label>
        <input type="text" class="form-control" id="diretor"  value="${filme.diretor}" name="diretor">
    </div>
    <br>
    <div class="container">
        <label for="elenco">Elenco:</label>
        <textarea class="form-control" rows="5" id="elenco" value="${filme.elenco}"  name="elenco"></textarea>
    </div>
    <br>
    <div class="container">
        <label for="anoEstreia">Ano:</label>
        <input type="number" class="form-control" id="anoEstreia" value="${filme.anoEstreia}"  name="anoEstreia">
    </div>
    <br>
    <div class="container">
        <label for="sinopse">Sinopse:</label>
        <textarea class="form-control" rows="5" id="sinopse" value="${filme.sinopse}" name="sinopse"></textarea>
    </div>
    <br>
    <div class="container">
        <label for="valor">Valor:</label>
        <input type="number" class="form-control" id="valor" value="${filme.valor}"  name="valor">
    </div>
    <br>
    <div class="container">
        <p><b>O filme é brasileiro?</b></p>
        <label class="radio-inline">
            <input type="radio" name="brasileiro" value="${filme.brasileiro}" checked>Sim
        </label>
        <label class="radio-inline">
            <input type="radio" name="brasileiro" value="${filme.brasileiro}">Não
        </label>
    </div>
    <br>
    <div class="container text-center">
        <button type="submit" class="btn btn-default btn-lg">${botao}</button>
    </div>
</form>
 <c:import url="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>