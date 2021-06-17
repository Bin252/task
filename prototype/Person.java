package prototype;


import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
    //����
    private String name;
    //����
    private int age;
    //����
    private List<String> friends;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<String> getFriends() {
        return friends;
    }
    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
    //��дtoString����
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", friends=" + friends + "]";
    }
    //ǳ���¡
    public Person shallowClone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    //����¡
    public Person deepClone() {
        try {
            Person person = (Person) super.clone();
            List<String> newFriends = new ArrayList<String>();
            for(String friend : this.getFriends()) {
                newFriends.add(friend);
            }
            person.setFriends(newFriends);
            return person;
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}