<%-- 
    Document   : editnote
    Created on : Jun 3, 2021, 4:04:24 PM
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
        <h2>Edit Note</h2>
        <form method="post" action="note">
            <label>Title: </label>
            <input type="text" name="editTitle" value="${txtNote.title}">
            <br>
            <label>Contents: </label>
            <textarea id="thecontent" name="editContent" rows="6" cols="25">${txtNote.content}</textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>