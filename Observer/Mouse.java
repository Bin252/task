package Observer;
public class Mouse implements Observer {

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public void response(Event e) {
        System.out.println(name + "£∫" + e.getName() + " ¿¥¿≤£¨øÏ≈‹∞°");
    }

}
