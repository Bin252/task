package Chain;

public class Director extends Leader{
    public Director(String name) {
        super(name);
    }
    @Override
    public void handleRequest(Request request) {
        if(request.getDay()<3){
            System.out.println(name+"��׼"+request.getName()+request.getDay()+"��ļ�");
        }
        else{
            this.successor.handleRequest(request);
        }
    }
}
