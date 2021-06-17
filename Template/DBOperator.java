package Template;

//模板方法模式
public abstract class DBOperator {

  public abstract void connDB();

  public void OpenDB(){
      System.out.println("打开数据库！");
  }

  public void useDB(){
      System.out.println("使用数据库！");
  }

  public void closeDB(){
      System.out.println("关闭数据库！");
  }

  public void process(){
      connDB();
      OpenDB();
      useDB();
      closeDB();
  }
}

