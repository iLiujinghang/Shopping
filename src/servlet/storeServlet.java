package servlet;

import dao.goodsDao;
import dao.goodsDaoImpl;
import domain.goods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "storeServlet",urlPatterns = "/storeServlet")
public class storeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        goodsDao buy = new goodsDaoImpl();

        List<goods> list = buy.getAllgoods();
        System.out.println(list);
        request.setAttribute("list",list);
        request.getRequestDispatcher("/goods.jsp").forward(request,response);
    }
}