package Observer;
public class Host implements Observer {
    
    private String name;

    public Host(String name) {
        this.name = name;
    }
    
    public void response(Event e) {
        System.out.println(name + "："+e.getName()+" 你又把我吵醒了");
    }
}
