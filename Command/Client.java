package Command;
public class Client {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Command cmd,cmd2,cmd3;
		
		//�򿪵��ӻ�
		cmd=new TVOpenCommand();
		Controller c1=new Controller(cmd);
		c1.function();
		
		//�رյ��ӻ�
		cmd2=new TVCloseCommand();
		Controller c2=new Controller(cmd2);
		c2.function();
		
		//��̨
		cmd3=new TVChangeCommand();
		Controller c3=new Controller(cmd3);
		c3.function();
		
	}
 
}