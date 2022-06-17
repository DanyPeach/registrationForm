package com.example.controller;

import com.example.connection.JDBCConnector;
import com.example.model.User;
import com.example.repository.impl.UserDAOImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/slay/*", "/shantay"})
public class HelloServlet extends HttpServlet {

    //На какой юрл будет срабаотывать наш сервелт, для этого мы указываем анотацию WebServlet

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        String name = req.getParameter("username");
        String age = req.getParameter("userage");
        String gender = req.getParameter("gender");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if(name.equals("") || Integer.parseInt(age)<0 ) {
            String path = req.getContextPath() + "/notFound";
            resp.sendRedirect(path);
        }else{
            int ageI = Integer.parseInt(age);
            UserDAOImpl personDAO = new UserDAOImpl();
            personDAO.createT(new User(name, ageI, gender, login,password));
            printWriter.write("Name: " + name );
            printWriter.write("Age: " + age );
            printWriter.write("Gender: " + gender );
            printWriter.write("Country: " + login );


            printWriter.close();
    }
    }


    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
