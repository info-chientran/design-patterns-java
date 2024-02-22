import java.util.Arrays;
import java.util.List;

public class BubbleSortAlgorithm implements SortStrategy {
    @Override
    public <T> void sort(List<Integer> items) {
        int n = items.size();
        int temp = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n-i); j++) {
                if(items.get(j-1) > items.get(j)){
                    temp = items.get(j - 1);
                    items.set(j - 1, items.get(j));
                    items.set(j, temp);
                }
            }
        }
        System.out.println(items);
    }
}
