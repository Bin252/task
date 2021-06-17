package Mediator;

import java.util.HashMap;
import java.util.Map;

//�����н�����
public  abstract class Mediator {
    //�����Ա����
    protected Map<String,Object> colleagues=new HashMap<String,Object>();
    //ע���Ա
    public void register(Colleague colleague)
    {
        colleagues.put(colleague.getName(),colleague);
        colleague.setMediator(this);
    }
    public abstract void sendText(String sender,String receiver,String text);
    public abstract void sendImage(String sender,String receiver,String image);

}

 