package Strategy;

public abstract class AbstractSortStrategy {

    public static final String DESC = "desc";  // ½µÐò
    public static final String ASC = "asc";    // ÉýÐò

    public void sort(int a[], String order) {
        if (a == null) {
            throw new IllegalArgumentException("array can not be null");
        }
        if (order.equals(ASC)) {
            asc(a);
        } else if (order.equals(DESC)) {
            desc(a);
        }
    }

    protected abstract void desc(int[] a);

    protected abstract void asc(int[] a);

}