package Strategy;



public class SortContext {

    private AbstractSortStrategy strategy;

    public SortContext(AbstractSortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortOrderByDesc(int[] array) {
        strategy.sort(array, AbstractSortStrategy.DESC);
    }

    public void sortOrderByAsc(int[] array) {
        strategy.sort(array, AbstractSortStrategy.ASC);
    }

}