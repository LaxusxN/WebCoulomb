<%-- 
    Document   : index
    Created on : May 1, 2023, 12:32:11 PM
    Author     : kalu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               
        <form action="servletsCoulomb" method="get">
            <label for="q1">Carga 1:</label>
            <input type="text" id="q1" name="q1" required>
            <br>
            <label for="q2">Carga 2:</label>
            <input type="text" id="q2" name="q2" required>
            <br>
            <label for="r">Distancia:</label>
            
            <input type="text" id="r" name="r" required>
            <br>
            <input type="submit" value="Calcular fuerza eléctrica">
        </form>

       <%System.out.println("hola mundo");%>
        
    </body>
</html>
