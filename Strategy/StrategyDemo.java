package Strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        int array[] = {2, 19, 5, 90, 3, 54, 7, 6, 8, 52, 11, 68, 33, 3, 5};
        System.out.println("Ô­ÐòÁÐ:");
        printArray(array);

        SortContext context = new SortContext(new BubbleSortStrategy());
        context.sortOrderByDesc(array);
        System.out.println("½µÐò£º");
        printArray(array);

        context = new SortContext(new BubbleSortStrategy());
        context.sortOrderByAsc(array);
        System.out.println("ÉýÐò£º");
        printArray(array);

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

}