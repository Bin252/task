package builder;

import java.util.ArrayList;

public class Client {
	 
	public static void main(String[] args) {
		BenzModel benz = new BenzModel();
		//���run˳��
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom"); //�ϰ�˵����֮ǰ�Ⱥ����Ƚ�˧��
		sequence.add("start");
		sequence.add("stop");
		//���ǰ����˳���豼��
		benz.setSequence(sequence);
		benz.run();
	}
}