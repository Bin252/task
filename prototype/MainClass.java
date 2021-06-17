package prototype;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        //��������person1
        Person person1 = new Person();
        //��ʼ������
        person1.setName("zhangsan");
        person1.setAge(20);
        List<String> friends = new ArrayList<String>();
        friends.add("lisi");
        friends.add("wangwu");
        person1.setFriends(friends);
        //person2��ǳ���¡
        Person person2 = person1.shallowClone();
        //person3������¡
        Person person3 = person1.deepClone();
        //��ȡǳ���¡��friends��list����
        List<String> person2_friends = person2.getFriends();
        //�����ö��������ֵ
        person2_friends.add("shallow");
        person2.setFriends(person2_friends);    
        //��ȡ����¡��friends��list����
        List<String> person3_friends = person3.getFriends();
        //�����ö��������ֵ
        person3_friends.add("deep");
        person3.setFriends(person3_friends);
        
        System.out.println("ԭ�ͣ�"+person1);
        System.out.println("ǳ���¡��"+person2);
        System.out.println("����¡��"+person3);
    }
}