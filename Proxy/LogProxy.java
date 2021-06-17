package Proxy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;
 
public class LogProxy extends AbstractLog {
   // private LogRecord logRecord = new LogRecord();
    private AbstractLog logRecord = new AbstractLog();
    private SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String time = SDF.format(new Date());
    public void method() {
        System.out.println("����Method�����ã�����ʱ��Ϊ��" + time);
        try {
            logRecord.method();
            System.out.println("����method()���óɹ�");
        }catch(Exception e) {
            System.out.println("����method()����ʧ��");
        }
    }
}