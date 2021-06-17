package Chain;
public class Client {
    public static void main(String[] args) {
        Leader director,manager,gemanager;
        Request r1,r2,r3,r4;

        director =new Director("张主任");
        manager=new Manager("李经理");
        gemanager=new GeManager("王总经理");

        director.setSuccessor(manager);
        manager.setSuccessor(gemanager);

        r1=new Request("张三",2);
        r2=new Request("李四",5);
        r3=new Request("王五",20);
        r4=new Request("小明",40);

        director.handleRequest(r1);
        director.handleRequest(r2);
        director.handleRequest(r3);
        director.handleRequest(r4);

    }

}
