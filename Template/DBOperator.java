package Template;

//ģ�巽��ģʽ
public abstract class DBOperator {

  public abstract void connDB();

  public void OpenDB(){
      System.out.println("�����ݿ⣡");
  }

  public void useDB(){
      System.out.println("ʹ�����ݿ⣡");
  }

  public void closeDB(){
      System.out.println("�ر����ݿ⣡");
  }

  public void process(){
      connDB();
      OpenDB();
      useDB();
      closeDB();
  }
}

