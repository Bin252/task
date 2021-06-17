package Proxy;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/config.xml"));
            //��ȡ�����������ı��ڵ�
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
            //ͨ����������ʵ�����󲢽��䷵��
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}