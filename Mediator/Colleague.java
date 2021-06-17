package Mediator;

//����ͬ������
public abstract class Colleague
  {
      //����һ���н���
      protected Mediator mediator;
      //�����Ա������
      protected String name;
      //���캯��
      public Colleague(){}
      public Colleague(String name) {
          this.name = name;
      }

      public String getName() {
          return name;
      }

      public Mediator getMediator() {
          return mediator;
      }

      public void setMediator(Mediator mediator) {
          this.mediator = mediator;
      }

      public void setName(String name) {
          this.name = name;
      }
      //��ͬ�Ļ�Ա����Ȩ�޲�ͬ
      public abstract void sendText(String to,String message);
      public abstract void sendImage(String to,String image);
      //�����н���Ȩ��
      public void receiveText(String sender,String text)
      {
          System.out.println(sender + "�����ı���" + this.name + "\n����Ϊ��" + text);
      }

      public void receiveImage(String sender,String image)
      {
          System.out.println(sender+ "����ͼƬ��" + this.name + "\n����Ϊ��" + image);
      }

  }


