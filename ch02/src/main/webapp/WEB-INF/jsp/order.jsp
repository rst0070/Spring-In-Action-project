<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/static/css/order.css"/>
    </head>
    <body>
        <h1>주문 및 배송</h1>
        <div class="menu">
            <div th:each="type : ${dishTypeArr}">
                <p th:text="${type}"></p>
            </div>
        </div>
        
    </body>
</html>