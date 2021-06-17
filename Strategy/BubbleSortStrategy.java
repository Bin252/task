package Strategy;



public class BubbleSortStrategy extends AbstractSortStrategy {

    @Override
    protected void asc(int[] a) {
        int d = a.length;
        boolean isChange = true;
        for (int i = 0; i < d - 1 && isChange; i++) {
            isChange = false;
            for (int j = 0; j < d - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] ^ a[j + 1];
                    a[j + 1] = a[j] ^ a[j + 1];
                    a[j] = a[j] ^ a[j + 1];
                    isChange = true;
                }
            }
        }
    }

    @Override
    protected void desc(int[] a) {
        int d = a.length;
        boolean isChange = true;
        for (int i = 0; i < d - 1 && isChange; i++) {
            isChange = false;
            for (int j = 0; j < d - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    a[j] = a[j] ^ a[j + 1];
                    a[j + 1] = a[j] ^ a[j + 1];
                    a[j] = a[j] ^ a[j + 1];
                    isChange = true;
                }
            }
        }
    }

}