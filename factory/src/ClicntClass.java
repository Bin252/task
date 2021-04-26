public class ClicntClass {
    public static void main(String[] args){
        Factory factor=new AFactory();
        Fruit fruit=factor.CreateFruit();
        //Fruit fruit=factor.CreateFruit("B");
        fruit.eat();

    }
    public  String factory(String fruitname){
        if(fruitname.equals("Apple"))
            return "Apple";
        if(fruitname.equals("Banana"))
            return "Banana";
        return null;

    }
}
