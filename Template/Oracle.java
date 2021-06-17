package Template;


public class Oracle extends DBOperator {
    @Override
    public void connDB() {
        System.out.println("使用JDBC-ODBC桥接连接Oracle数据库");
    }
}

