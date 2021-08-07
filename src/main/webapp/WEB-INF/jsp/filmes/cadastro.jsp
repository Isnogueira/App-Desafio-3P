<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
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
    <h2>Cadastro filmes</h2>
</div>
<form action="" method="">
    <div class="container">
        <label for="nome">Nome:</label>
        <input type="text" class="form-control" id="nome" name="nome">
        <br>
        <div class="form-group">
            <label for="genero">Genero:</label>
            <input type="text" class="form-control" id="genero" name="genero">
        </div>
        <br>
        </div>
        <div class="form-group">
            <label for="diretor">Diretor:</label>
            <input type="text" class="form-control" id="diretor"  name="diretor">
        </div>
        <br>
        <div class="form-group">
            <label for="elenco">Elenco:</label>
            <textarea class="form-control" rows="5" id="elenco"></textarea>
        </div>
        <br>
        <div class="form-group">
            <label for="ano">Ano:</label>
            <input type="number" class="form-control" id="ano"  name="ano">
        </div>
        <br>
        <div class="form-group">
            <label for="sinopse">Sinopse:</label>
            <textarea class="form-control" rows="5" id="sinopse"></textarea>
        </div>
        <div class="form-group">
            <label for="valor">Valor:</label>
            <input type="number" class="form-control" id="valor"  name="valor">
        </div>
        <br>
        <div class="form-group">
            <p><b>O filme é brasileiro?</b></p>
            <label class="radio-inline">
                <input type="radio" name="brasileiro?" value="sim" checked>Sim
            </label>
            <label class="radio-inline">
                <input type="radio" name="brasileiro?" value="nao">Não
            </label>
        </div>
        <br>
        <div class="form-group">
            <button type="submit" class="btn btn-default btn-lg btn-block">Enviar</button>
        </div>
    </div>
</form>
<br>
</body>
</html>