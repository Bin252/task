package Chain;
public class Manager extends Leader{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getDay()>=3 && request.getDay()<10){
            System.out.println(name+"��׼"+request.getName()+request.getDay()+"��ļ�");
        }
        else{
            this.successor.handleRequest(request);
        }
    }
}
