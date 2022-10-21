package com.admin;

import com.JDBC.DBManager;
import com.schoolsystem.model.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/addStudent")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String patronymic = request.getParameter("patronymic");
        int grade = Integer.parseInt(request.getParameter("grade"));
        String phoneNum = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("add st servlet ");
        Students student = new Students(name,surname,patronymic,grade,phoneNum,email,password);
        if(name != null && surname !=null ){
            DBManager.addStudents(student);
            RequestDispatcher rd = request.getRequestDispatcher("/StudentList.jsp");
            rd.forward(request, response);
        }
    }
}
