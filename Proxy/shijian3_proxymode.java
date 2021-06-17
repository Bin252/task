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
            //format对象是用来以指定的时间格式格式化时间的
            SimpleDateFormat from = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 
            //format()方法是用来格式化时间的方法
            String times = from.format(date);
            System.out.println("方法method()被调用，调用时间为:" + times);
            //用来产生除零异常来模拟method方法调用是否成功
            Random random = new Random();
            int a = random.nextInt(100);
            int b = random.nextInt(10);
            int c = a / b;
            System.out.println("方法method()调用成功");
        } catch (Exception e) {
            System.out.println("方法method()调用失败");
        }
    }
}