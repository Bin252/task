package Mediator;

public class ConcreteMediator extends Mediator {
    @Override
    public void sendText(String sender, String receiver, String text) {
        //ͨ������Ľ����ߵ����֣���ȡ�����߶���
         Colleague receiver1= (Colleague) colleagues.get(receiver);
         //�Բ����ַ����й��ˣ��罫���ա��ַ����á�*������
        String text1=text.replaceAll("��","*");
        receiver1.receiveText(sender,text1);
    }

    @Override
    public void sendImage(String sender, String receiver, String image) {
        Colleague receiver1= (Colleague) colleagues.get(receiver);
        //�Է���ͼƬ��С���п���
        if(image.length()>15){
            System.out.println("ͼƬ̫�󣬷���ʧ��");
        }
        else{
            receiver1.receiveImage(sender,image);
        }
    }
}

