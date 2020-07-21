package jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedList;

public class jdbcUtils {

    public static LinkedList<Connection> pool = new LinkedList<Connection>();
    static {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/shopping";//?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8"
            String username = "root";
            String password = "liu336699";
            Class.forName(driver);
            for (int i = 0;i<50;i++){
                Connection conn = DriverManager.getConnection(url,username,password);
                pool.add(conn);
            }

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection(){
        try{
            if(!pool.isEmpty()){
                System.out.println("连接池中有连接");
                Connection conn = pool.removeFirst();
                return conn;
            }
            System.out.println("连接池中没有连接");
            Thread.sleep(500);
            return getConnection();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void release(Connection conn){
        try {
            if(conn!=null){
                conn.close();//不是真的关闭
                pool.add(conn);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}