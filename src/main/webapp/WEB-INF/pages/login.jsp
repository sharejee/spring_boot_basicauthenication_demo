<%--
  Created by IntelliJ IDEA.
  User: r.ron
  Date: 2/5/2018
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h1>login</h1>
<form action="/login" method="POST" class="form-signin">
    <h3 text="Welcome"></h3>
    <br/>

    <input type="text" id="email" name="email"  placeholder="Email" /> <br/>
    <input type="password"  placeholder="Password"
           id="password" name="password" /> <br />

    <button name="Submit" value="Login" type="Submit" text="Login">Login</button>
</form>
</body>
</html>
