package servlet;

import Utils.UploadUtils;
import dao.goodsDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "uploadServlet", urlPatterns = "/uploadServlet")
@MultipartConfig
public class uploadServlet extends HttpServlet {
    private static final long serialVersionUID = 5661013723204858883L;
    goodsDaoImpl goodsDaoImpl = new goodsDaoImpl();


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取文件上传组件
        Part part = request.getPart("file");
        //获取文件的路径
        String header = part.getHeader("content-disposition");
        String path = header.substring(header.indexOf("filename=") + 10, header.length() - 1);
        //获取文件名
        String name = UploadUtils.getRealName(path);
        //获取文件存放目录
        String dir = UploadUtils.getDir(name);

        String realPath = this.getServletContext().getRealPath("/upload" + dir);
        File file = new File(realPath);
        if (!file.exists()){
            file.mkdirs();
        }
        System.out.println(name);
        System.out.println(file);
        //对拷流
        InputStream inputStream = part.getInputStream();
        FileOutputStream outputStream = new FileOutputStream(new File(file,name));
        int len = -1;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        //关闭资源
        outputStream.close();
        inputStream.close();
        //删除临时文件夹
        part.delete();
        if (goodsDaoImpl.allinsert(file,name)){
            System.out.println("插入数据库成功");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().print("文件"+name +"导入成功");
        }else {
            System.out.println("插入数据库失败");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().print("文件"+name +"格式不正确或导入的数据已存在");
        }

    }
}