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

@WebServlet(name = "loginServlet",urlPatterns = "/loginServlet")
public class loginServlet extends HttpServlet {
    service.userService userService = new userServiceImpl();
    userDao userDao = new userDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        String id = req.getParameter("ID");
        String psd = req.getParameter("pwd");

        if(userService.Login(id,psd)){
            user user = userDao.getUser(id);
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            String sessionId = session.getId();

            if (session.isNew()){
                System.out.println("session创建成功，id为："+sessionId);
            }else {
                System.out.println("服务器已存在该sessionID");
            }
            req.getRequestDispatcher("/html/index.jsp").forward(req,resp);
        }else {
            System.out.println("账号不存在");
        }

    }
}
