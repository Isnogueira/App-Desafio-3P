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
    <style>
        body {
          margin: 0;
          padding: 0;
          background-image: url("/img/fundo.jpg");
          height: 100vh;
        }
        #login .container #login-row #login-column #login-box {
          margin-top: 120px;
          max-width: 600px;
          height: 320px;
          border: 1px solid #9C9C9C;
          background-color: #EAEAEA;
        }
        #login .container #login-row #login-column #login-box #login-form {
          padding: 20px;
        }
        #login .container #login-row #login-column #login-box #login-form #register-link {
          margin-top: -85px;
        }
    </style>
</head>
<body>
<form id="login-form" class="form" action="/login" method="post">
    <div class="container">
       <c:if test="${not empty mensagem}">
           <div class="alert alert-danger">
              <strong>ERRO: </strong>${mensagem}
            </div>
       </c:if>
    </div>
       <div id="login">
            <h3 class="text-center">My flix</h3>
               <div class="container">

                   <div id="login-row" class="row justify-content-center align-items-center">
                       <div id="login-column" class="col-md-6">
                           <div id="login-box" class="col-md-12">

                                   <h3 class="text-center text-info">Login</h3>
                                       <div class="form-group">
                                           <label for="email" class="text-info">E-mail:</label><br>
                                           <input type="email" name="email" id="email" class="form-control">
                                       </div>
                                       <div class="form-group">
                                           <label for="senha" class="text-info">Senha:</label><br>
                                           <input type="password" name="senha" id="senha" class="form-control">
                                       </div>
                                       <div class="form-group">
                                           <label for="remember-me" class="text-info"><span>Remember me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                                           <input type="submit" name="submit" class="btn btn-info btn-md" value="Entrar">
                                       </div>
                                       <!--
                                       <div id="register-link" class="text-right">
                                           <a href="#" class="text-info">Register here</a>
                                       </div>
                                       -->
                                   </div>

                           </div>
                       </div>
                   </div>
               </div>
       </div>
</form>
<body>
<html>