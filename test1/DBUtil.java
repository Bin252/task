package test1;

import com.mysql.jdbc.Connection;

import java.sql.*;
public class DBUtil {
	Connection getconnection()
	{// MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
	    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";
	 
	    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
	    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	    //static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	 
	 
	    // 数据库的用户名与密码，需要根据自己的设置
	    final String USER = "root";
	    final String PASS = "123456";
	 
	        java.sql.Connection conn = null;
	        Statement stmt = null;
	        try{
	            // 注册 JDBC 驱动
	            Class.forName(JDBC_DRIVER);
	        
	            // 打开链接
	            //System.out.println("连接数据库...");
	            conn = DriverManager.getConnection(DB_URL,USER,PASS);
	          
	            
	            }
	        catch(SQLException se){
	            // 处理 JDBC 错误
	            se.printStackTrace();
	        }catch(Exception e){
	            // 处理 Class.forName 错误
	            e.printStackTrace();
	        }
			return (Connection) conn;
		
	    }
	

}
