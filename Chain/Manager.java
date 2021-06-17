package Chain;
public class Manager extends Leader{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getDay()>=3 && request.getDay()<10){
            System.out.println(name+"批准"+request.getName()+request.getDay()+"天的假");
        }
        else{
            this.successor.handleRequest(request);
        }
    }
}
