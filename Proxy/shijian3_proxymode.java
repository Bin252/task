package Proxy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
 
public class shijian3_proxymode {
    public static void main(String[] args) {
        AbstractLog al;
        //al = (AbstractLog)XMLUtil.getBean();
        //al.method();
 
        try {
            Date date = new Date();
            //format������������ָ����ʱ���ʽ��ʽ��ʱ���
            SimpleDateFormat from = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 
            //format()������������ʽ��ʱ��ķ���
            String times = from.format(date);
            System.out.println("����method()�����ã�����ʱ��Ϊ:" + times);
            //�������������쳣��ģ��method���������Ƿ�ɹ�
            Random random = new Random();
            int a = random.nextInt(100);
            int b = random.nextInt(10);
            int c = a / b;
            System.out.println("����method()���óɹ�");
        } catch (Exception e) {
            System.out.println("����method()����ʧ��");
        }
    }
}