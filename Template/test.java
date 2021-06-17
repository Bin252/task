package Template;


public class test {
    public static void main(String[] args) {
        DBOperator dbOne;
        dbOne = new Mysql();
        dbOne.process();

        DBOperator dbTwo;
        dbTwo = new Oracle();
        dbTwo.process();
    }
}

