package Mediator;


public class Client {
    public static void main(String[] args) {
       Mediator chatRoom=new ConcreteMediator();
       Colleague colleague1,colleague2;

       colleague1=new CommonMember("����");
       colleague2=new DiamondMember("����");

        chatRoom.register(colleague1);
        chatRoom.register(colleague2);

        //������ͨ��Ա�ķ���Ȩ��
        System.out.println("-----------------------------������ͨ��Ա�ķ���Ȩ��---------------------------\n");
        colleague1.sendText("����","������ͨ��Ա�����㷢���ı���");
        colleague1.sendImage("����","������ͨ��Ա�����㷢��ͼƬ��");


       //������ʯ��Ա����Ȩ��
        System.out.println("\n------------------------------������ʯ��Ա����Ȩ��-----------------------------\n");
        colleague2.sendText("����","������ʯ��Ա�����㷢���ı�");
        colleague2.sendImage("����","������ʯ��Ա�����㷢��ͼƬ��");

        //���Թ��˲����ַ�
        System.out.println("\n----------------------------------���Թ��˲����ַ�-------------------------------\n");
        colleague1.sendText("����","������");

        //���Է���ͼƬ��С
        System.out.println("\n-----------------------------���Է���ͼƬ��С---------------------------------\n");
        colleague2.sendImage("����","���Է���ͼƬ��С���Է���ͼƬ��С���Է���ͼƬ��С���Է���ͼƬ��С");
    }
}

