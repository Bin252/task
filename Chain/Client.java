package Chain;
public class Client {
    public static void main(String[] args) {
        Leader director,manager,gemanager;
        Request r1,r2,r3,r4;

        director =new Director("������");
        manager=new Manager("���");
        gemanager=new GeManager("���ܾ���");

        director.setSuccessor(manager);
        manager.setSuccessor(gemanager);

        r1=new Request("����",2);
        r2=new Request("����",5);
        r3=new Request("����",20);
        r4=new Request("С��",40);

        director.handleRequest(r1);
        director.handleRequest(r2);
        director.handleRequest(r3);
        director.handleRequest(r4);

    }

}
