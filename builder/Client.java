package builder;

import java.util.ArrayList;

public class Client {
	 
	public static void main(String[] args) {
		BenzModel benz = new BenzModel();
		//存放run顺序
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom"); //老板说：跑之前先轰鸣比较帅！
		sequence.add("start");
		sequence.add("stop");
		//我们把这个顺序赋予奔驰
		benz.setSequence(sequence);
		benz.run();
	}
}