import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy sortStrategy;
    private List<Integer> items = new ArrayList<>();
    public void setSortStrategy(SortStrategy strategy) {
        this.sortStrategy = strategy;
    }
    public void add(Integer num) {
        items.add(num);
    }
    public void sort() {
        sortStrategy.sort(items);
    }
}
