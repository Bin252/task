package Chain;
public class GeManager extends Leader{
    public GeManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getDay()>=10 && request.getDay()<30){
            System.out.println(name+"批准"+request.getName()+request.getDay()+"天的假");
        }
        else{
            System.out.println(request.getName()+"想要请"+request.getDay()+"天的假，不给批准！");
        }
    }
}

