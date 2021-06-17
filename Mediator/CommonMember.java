package Mediator;


public class CommonMember extends Colleague {
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String receiver, String text) {
        mediator.sendText(name,receiver,text);
    }

    @Override
    public void sendImage(String receiver, String image) {
        System.out.println("��ͨ��Ա���ܷ���ͼƬ��");
    }
}
