package com.example.controller;

import com.example.connection.JDBCConnector;
import com.example.model.User;
import com.example.repository.impl.UserDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/login")
public class LoginServ extends HttpServlet {
    JDBCConnector connector = new JDBCConnector();
    UserDAOImpl userDAO = new UserDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        PrintWriter writer = resp.getWriter();

        UserDAOImpl userDAO = new UserDAOImpl();

         try {
            boolean res = userDAO.findUser(login,password);
             UserDAOImpl personDAO = new UserDAOImpl();
             User user1 = personDAO.getUser(login, password);
            if(res){
                HttpSession session1 = req.getSession();
                session1.setAttribute("name", user1.getName());
                session1.setAttribute("age", user1.getAge());
                session1.setAttribute("gender", user1.getGender());
                session1.setAttribute("login", user1.getLogin());
                getServletContext().getRequestDispatcher("/userpage.jsp").forward(req,resp);

                String path = req.getContextPath() + "/userpage.jsp";
                resp.sendRedirect(path);
            } else if(!login.equals(user1.getLogin()) || !password.equals(user1.getPassword())){
                String path = req.getContextPath() + "/notFound";
                resp.sendRedirect(path);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
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
