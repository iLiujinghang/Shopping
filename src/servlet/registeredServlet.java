package servlet;

import dao.userDao;
import dao.userDaoImpl;
import domain.user;
import service.userService;
import service.userServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "registeredServlet",urlPatterns = "/registeredServlet")
public class registeredServlet extends HttpServlet {
    userService userService = new userServiceImpl();
    userDao userDao = new userDaoImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");// 设置响应内容类型
        String id =  request.getParameter("id");
        String name = request.getParameter("name");
        String psd = request.getParameter("pwd");
        String phone = request.getParameter("phone");
        String add = request.getParameter("add");
        System.out.println(id+name+psd);
        try {
            if (userService.regidtered(id,name,psd,phone,add)){
                user user = userDao.getUser(id);
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                request.getRequestDispatcher("/store.jsp").forward(request,response);
            }else {
                PrintWriter out = response.getWriter();
                String title = "用户名已存在或值为空";
                String docType = "<!DOCTYPE html> \n";
                out.println(
                        docType+
                                "<html>\n"+
                                "<head><title>" + title + "</title></head>\n" +
                                "<body bgcolor=\"#f0f0f0\">\n" +
                                "<h1 align=\"center\">" + title + "</h1>\n" +
                                "<p>"+title+"</p>\n"+
                                "</body></html>"
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
