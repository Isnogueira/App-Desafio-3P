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
    <h3>My flix</h3>
    <p><em>Sua plataforma de filmes</em></p>
    <p>Armazene seus filmes para ver quando quiser!</p>
</div>
<br>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="/img/netflix.jpg" alt="netflix" style="width:100%;">
            <div class="carousel-caption">
                <!--<h3>New York</h3>
                <p>The atmosphere in New York is lorem ipsum.</p>-->
            </div>
        </div>

        <div class="item">
            <img src="/img/controle.jpg" alt="controle" style="width:100%;">
            <div class="carousel-caption">
                <!--<h3>Chicago</h3>
                 <p>Thank you, Chicago - A night we won't forget.</p>-->
            </div>
        </div>

        <div class="item">
            <img src="img/homemcelular.jpg" alt="homem" style="width:100%;">
            <div class="carousel-caption">
                <!--<h3>LA</h3>
                <p>Even though the traffic was a mess, we had the best time.</p>-->
            </div>
        </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<br>
 <c:import url="/WEB-INF/jsp/footer.jsp"/>
</body>
</html>