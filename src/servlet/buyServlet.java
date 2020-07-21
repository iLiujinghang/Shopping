package servlet;

import dao.goodsDao;
import dao.goodsDaoImpl;
import dao.userDao;
import dao.userDaoImpl;
import service.userService;
import service.userServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "buyServlet",urlPatterns = "/buyServlet")
public class buyServlet extends HttpServlet {
    goodsDao buy = new goodsDaoImpl();
    userDao buycar = new userDaoImpl();
    userService userService = new userServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_id = request.getParameter("user_id");
        String goods_id = request.getParameter("goods_id");int goodsid=Integer.parseInt(goods_id);
        String goods_name = request.getParameter("goods_name");
        System.out.println("当前从商城获得的用户ID:"+user_id);
        if (buy.update(goods_id)){
            int i = 1;//购买数量
            userService.buycar(user_id,goodsid,i);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().print(goods_name+"购买成功！");
        }else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().print(goods_name+"已售罄");
        }
    }
}