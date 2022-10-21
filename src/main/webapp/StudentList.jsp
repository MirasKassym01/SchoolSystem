<%@ page import="com.schoolsystem.model.Students" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.JDBC.DBManager" %><%--
  Created by IntelliJ IDEA.
  User: kasim
  Date: 10/20/2022
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<html>
    <head>
        <title>Student List </title>
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
            }

            #table {
                margin-top: 150px;
                margin-left: 370px;
                max-width: 700px;
            }
            .form {
                margin-top: 150px;
                margin-left: 370px;
                max-width: 700px;
            }

            #form {
                margin-left: 650px;
            }
        </style>
    </head>
        <body>
        <table class="table table-success table-striped" id="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Surname</th>
                <th scope="col">Patronymic</th>
                <th scope="col">Grade</th>
                <th scope="col">Phone</th>
                <th scope="col">E-mail</th>
                <th scope="col">Password</th>
            </tr>
            </thead>
            <%
                ArrayList<Students> students = DBManager.getStudentsArrayLists();
                if (students == null){
                    DBManager.AutoAddStudents();
                }
                else if(students != null){
                    for (Students type : students) {
            %>

            <tr>
                <td scope="row">
                    <%=type.getId()%>
                </td>
                <td>
                    <%=type.getName()%>
                </td>
                <td>
                    <%=type.getSurname()%>
                </td>
                <td>
                    <%=type.getPatronymic()%>
                </td>
                <td>
                    <%=type.getGrade()%>
                </td>
                <td>
                    <%=type.getPhoneNum()%>
                </td>
                <td>
                    <%=type.getEmail()%>
                </td>
                <td>
                    <%=type.getPassword()%>
                </td>
            </tr>
            <%
                    }
                }
            %>
        </table>
        <br>

        <div>
            <form action="deleteStudent" method="post">
                <div class="form">
                    <lable for="floatId1">Select id:</lable>
                    <input id="floatId1" type="text" name="id" class="form-control">
                    <br>
                    <input type="submit" value="Delete" class="btn btn-success">
                    <a href="adminHome.jsp" class="btn btn-success">Home</a><br/>
                </div>
            </form>
        </div>

    </body>
</html>
