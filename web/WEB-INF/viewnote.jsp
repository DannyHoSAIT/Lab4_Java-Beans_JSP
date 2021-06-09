<%-- 
    Document   : viewnote
    Created on : Jun 3, 2021, 4:04:08 PM
    Author     : danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <form method="post" action="note">
            <h4>Title: <span>${txtNote.getTitle()}</span></h4>
            <h4>Contents: <span>${txtNote.getContent()}</span></h4>
        </form>
        <a href="note?edit">Edit</a>
    </body>
</html>
