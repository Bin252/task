package Chain;
public class GeManager extends Leader{
    public GeManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getDay()>=10 && request.getDay()<30){
            System.out.println(name+"��׼"+request.getName()+request.getDay()+"��ļ�");
        }
        else{
            System.out.println(request.getName()+"��Ҫ��"+request.getDay()+"��ļ٣�������׼��");
        }
    }
}

