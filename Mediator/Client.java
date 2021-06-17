package Mediator;


public class Client {
    public static void main(String[] args) {
       Mediator chatRoom=new ConcreteMediator();
       Colleague colleague1,colleague2;

       colleague1=new CommonMember("张三");
       colleague2=new DiamondMember("李四");

        chatRoom.register(colleague1);
        chatRoom.register(colleague2);

        //测试普通会员的发送权限
        System.out.println("-----------------------------测试普通会员的发送权限---------------------------\n");
        colleague1.sendText("李四","我是普通会员，向你发送文本！");
        colleague1.sendImage("李四","我是普通会员，向你发送图片！");


       //测试钻石会员发送权限
        System.out.println("\n------------------------------测试钻石会员发送权限-----------------------------\n");
        colleague2.sendText("张三","我是钻石会员，向你发送文本");
        colleague2.sendImage("张三","我是钻石会员，向你发送图片！");

        //测试过滤不雅字符
        System.out.println("\n----------------------------------测试过滤不雅字符-------------------------------\n");
        colleague1.sendText("李四","测试日");

        //测试发送图片大小
        System.out.println("\n-----------------------------测试发送图片大小---------------------------------\n");
        colleague2.sendImage("张三","测试发送图片大小测试发送图片大小测试发送图片大小测试发送图片大小");
    }
}

