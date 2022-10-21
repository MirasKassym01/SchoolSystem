<%--
  Created by IntelliJ IDEA.
  User: kasim
  Date: 10/20/2022
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<html>
    <head>
        <title>Add student</title>
        <style>
            body {
                width: auto;
                height: auto;
                background-color: #cbcbcb;
                margin-bottom: auto;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
                font-family: Monaco;
            }

            #form {
                max-width: 300px;
                margin-top: 200px;
                margin-left: 600px;
            }
        </style>
    </head>
    <body>
        <form action="addStudent" method="post" id="form">

            <div>
                <label>Name:</label>
                <input type="text" name="name" class="form-control" placeholder="Alihan">
            </div>
            <br>
            <div>
                <label>Surname:</label>
                <input type="text" name="surname" class="form-control" placeholder="Abzalov">
            </div>
            <br>
            <div>
                <label>Patronymic:</label>
                <input type="text" name="patronymic" class="form-control" placeholder="Olzhasuly">
            </div>
            <br>
            <div>
                <label>Grade:</label>
                <input type="text" name="grade" class="form-control" placeholder="11">
            </div>
            <br>
            <div>
                <label>Phone number:</label>
                <input type="text" name="phone" class="form-control" placeholder="+7 777 777 77 77">
            </div>
            <br>
            <div>
                <label>E-mail:</label>
                <input type="email" name="email" class="form-control" placeholder="alihan@gmail.com">
            </div>
            <br>
            <div>
                <label>Password:</label>
                <input type="text" name="password" class="form-control" placeholder="as45we78">
            </div>
            <br>

            <div class="text-center">
                <button class="btn btn-success">Submit</button>
                <a href="adminHome.jsp" class="btn btn-success">Home</a><br/>
            </div>
        </form>
    </body>
</html>
