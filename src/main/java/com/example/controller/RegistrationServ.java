package com.example.controller;

import com.example.model.User;
import com.example.repository.impl.UserDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class RegistrationServ extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
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
            HttpSession session = req.getSession();
            session.setAttribute("name", name);
            session.setAttribute("age", age);
            session.setAttribute("gender", gender);
            session.setAttribute("login", login);
            getServletContext().getRequestDispatcher("/userpage.jsp").forward(req,resp);
            String path = req.getContextPath() + "/userpage.jsp";
            resp.sendRedirect(path);
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
