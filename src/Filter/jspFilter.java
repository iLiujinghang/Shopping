//package Filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebFilter(filterName = "Filter")
//public class jspFilter implements javax.servlet.Filter {
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        chain.doFilter(req, resp);
//
//        HttpServletRequest httpServletRequest = (HttpServletRequest)req;
//        HttpServletResponse httpServletResponse = (HttpServletResponse)resp;
//
//        String url = httpServletRequest.getRequestURI();
////        if (url!= null && url.endsWith(".jsp"))
////        {
////            req.getRequestDispatcher("/index.jsp").forward(req,resp);
////            return;
////        }
//        chain.doFilter(httpServletRequest, httpServletResponse);
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//
//    }
//
//}
