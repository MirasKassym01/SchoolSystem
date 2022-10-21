<%--
  Created by IntelliJ IDEA.
  User: kasim
  Date: 10/20/2022
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<html>
    <head>
        <title>Login</title>
        <style>
            body {
                width: auto;
                height: 735px;
                background-color: #cbcbcb;
                margin-bottom: auto;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }

            .home {
                height: 100px;
                width: 100px;
                border-color: #c2e254 #9bb838 #9bb838 #c2e254;
                border-style: solid;
                border-width: 1px;
                background: #c2e254;
                cursor: pointer;
                width: 20%;
                border-radius: 4px;
                margin-bottom: 100px;
                margin-top: 500px;
                color: #000000;
                font-size: 50px;
                font-family: helvetica, serif;
                text-decoration: none;
                vertical-align: middle;
            }

            h1 {
                color: black;
                font-family: Monaco;
                margin-left: 15px;
            }

            h5 {
                margin-left: 15px;
                color: black;
                font-family: Monaco, fantasy;
            }



            #form {
                max-width: 300px;
                margin-top: 200px;
                margin-left: 625px;
            }
        </style>

        <title>Log In</title>
    </head>
    <body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
        <form action="auth" method="post">
            <div id="form">
                <div class="form-floating mb-3">
                    <input type="email" name="email" class="form-control" id="floatingInput" placeholder="name@example.com">
                    <label for="floatingInput">Email address</label>
                </div>
                <div class="form-floating">
                    <input type="password" name="password" class="form-control" id="floatingPassword"
                           placeholder="Password">
                    <label for="floatingPassword">Password</label>
                </div>

                <div class="text-center">
                    <button class="btn btn-success">Login</button>
                </div>
            </div>
        </form>
    </body>
</html>
