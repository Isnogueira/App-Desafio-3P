<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form action="/usuario" method="post">
    <div class="container">
           <c:if test="${not empty mensagem}">
               <div class="alert alert-danger">
                  <strong>ERRO: </strong>${mensagem}
                </div>
           </c:if>
            </div>
            <h3 class="text-center text-info">Registrar</h3>
             <div class="container">
                 <label for="nome" class="text-info">Nome:</label><br>
                 <input type="text" name="nome" id="email" class="form-control">
             </div>
            <br>

           <div class="container">
               <label for="email" class="text-info">E-mail:</label><br>
               <input type="email" name="email" id="email" class="form-control">
           </div>
           <br>
           <div class="container">
               <label for="senha" class="text-info">Senha:</label><br>
               <input type="password" name="senha" id="senha" class="form-control">
           </div>
           <br>
            <div class="container">
              <input type="submit" name="submit" class="btn btn-primary btn-lg btn-block" value="Entrar">
            </div>
    </div>
</form>
<body>
<html>