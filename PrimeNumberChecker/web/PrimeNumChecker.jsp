<%-- 
    Document   : PrimeNumChecker
    Created on : Aug 7, 2018, 6:34:31 PM
    Author     : Books
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>------Result------</h1><hr>
        INPUT NUMBER: ${PrimeNum.num}<br><br>
        RESULT: ${PrimeNum.checkPrime}<br><br>
        COUNT: ${PrimeNum.count}
    </body>
</html>
