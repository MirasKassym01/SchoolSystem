package com.JDBC;

import com.schoolsystem.model.Students;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

public class DBManager {
    private static Connection connection;

    private InitialContext ctx;

    public static void Connector() {
        try {
            Class.forName(("com.mysql.jdbc.Driver"));
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=UTC","root","");
            System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public DBManager() {
        try {
            ctx = new InitialContext();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public Connection openAccess(){
        try {
            System.out.println("P");
            Context context = (Context) ctx.lookup("java:comp/env");
            DataSource dataSource = (DataSource) context.lookup("jdbc/root");
            return dataSource.getConnection();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void AutoAddStudents(){
        try{
            Connector();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Miras', 'Kassym','Olzhas',5,'8777777777','a@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Alihan', 'Kassym','Olzhas',6,'8777777777','o@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Kana', 'Kassym','Olzhas',11,'8777777777','k@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Shynggys', 'Kassym','Olzhas',2,'8777777777','sh@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Dana', 'Kassym','Olzhas',9,'8777777777','d@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Dias', 'Kassym','Olzhas',5,'8777777777','dd@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Ten', 'Kassym','Olzhas',5,'8777777777','t@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Mirat', 'Kassym','Olzhas',5,'8777777777','m@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Marat', 'Kassym','Olzhas',5,'8777777777','mt@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Danyar', 'Kassym','Olzhas',5,'8777777777','da@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Asan', 'Kassym','Olzhas',5,'8777777777','asan@gmail.com','asasas')"+
                    "INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, 'Samat', 'Kassym','Olzhas',5,'8777777777','samat@gmail.com','asasas')");
            ps.executeUpdate();
            ps.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addStudents(Students students){
        try{
            Connector();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO student (id, name, surname, patronymic, grade,phone_num,email,password) VALUES (NULL, ?, ?,?,?,?,?,?)");
            ps.setString(1,students.getName());
            ps.setString(2, students.getSurname());
            ps.setString(3, students.getPatronymic());
            ps.setInt(4, students.getGrade());
            ps.setString(5, students.getPhoneNum());
            ps.setString(6,students.getEmail());
            ps.setString(7,students.getPassword());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Students> getStudentsArrayLists(){
        ArrayList<Students> students = new ArrayList<>();
        try {
            Connector();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Students student = new Students(rs.getInt("id"), rs.getString("name"),
                        rs.getString("surname"), rs.getString("patronymic"),rs.getInt("grade"),rs.getString("phone_num"), rs.getString("email"),rs.getString("password"));
                students.add(student);
            }

            preparedStatement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public static void deleteStudents(int id){
        try{
            Connector();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM student WHERE id = "+id+" ");
            ps.executeUpdate();
            ps.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
