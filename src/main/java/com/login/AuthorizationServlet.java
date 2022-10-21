package com.login;

import com.JDBC.DBManager;
import com.schoolsystem.model.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/auth")
public class AuthorizationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(email.equals("a@admin") && password.equals("admin")){
            RequestDispatcher rd = request.getRequestDispatcher("/adminHome.jsp");
            rd.forward(request,response);
        }

        String redirect = "login?emailerror";
        ArrayList<Students> students = DBManager.getStudentsArrayLists();
        Students student = new Students();
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getEmail().equals(email)){
                student = students.get(i);
            }
        }

        if(student != null){
            redirect =  "login?passworderror";
            if(student.getPassword().equals(password)){
                request.getSession().setAttribute("CURRENT_USER",student);
                redirect  = "student.html";
            }
        }
        response.sendRedirect(redirect);
    }
}
