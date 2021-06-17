package Template;

public class Mysql extends DBOperator {
    @Override
    public void connDB() {
        System.out.println("使用JDBC-ODBC桥接连接Mysql数据库");
    }
}

