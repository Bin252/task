package Observer;
public class Test {
    
    public static void main(String[] args) {
        
        Cat c = new Cat("���è");
        c.addObserver(new Mouse("Billy"));
        c.addObserver(new Mouse("Mick"));
        c.addObserver(new Host("����"));
        c.cry();
    }
}