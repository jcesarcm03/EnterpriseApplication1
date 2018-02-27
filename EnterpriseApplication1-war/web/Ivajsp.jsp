<%-- 
    Document   : Ivajsp
    Created on : 27/02/2018, 04:50:14 PM
    Author     : SURA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
   	
        
    </header>

    <body>
        <header>
	<h1>Ingrese el % de Iva y posterior el valor a calcular el Iva </h1>
	</header>
        <form action="IvaServlet" method="POST">
            <input type="text" name="t1">
            <input type="text" name="t2">
            <input type="submit" value="Buscar Iva">
            
        </form>
    </body>
</html>
