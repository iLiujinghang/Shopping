package servlet;

import dao.userDao;
import dao.userDaoImpl;
import service.userService;
import service.userServiceImpl;
import domain.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "indexServlet",urlPatterns = "/indexServlet")
public class indexServlet extends HttpServlet {
    userService userService = new userServiceImpl();
    userDao userDao = new userDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");// 设置响应内容类型

        String id = request.getParameter("ID");
        String psd = request.getParameter("pwd");
        if (userService.Login(id,psd)){
            user user = userDao.getUser(id);
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            String sessionId = session.getId();
            //判断session是不是新创建的
            if (session.isNew()){
                System.out.println("session创建成功，id为"+sessionId);
            }else {
                System.out.println("服务器已经存在该session了，id为"+sessionId);
            }
            System.out.println(user);
            request.getRequestDispatcher("/html/index.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("/registered.jsp").forward(request,response);
        }

    }
}
