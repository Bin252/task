package Chain;

public class Director extends Leader{
    public Director(String name) {
        super(name);
    }
    @Override
    public void handleRequest(Request request) {
        if(request.getDay()<3){
            System.out.println(name+"批准"+request.getName()+request.getDay()+"天的假");
        }
        else{
            this.successor.handleRequest(request);
        }
    }
}
