import java.util.Random;

public class App {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        Random random = new Random();

        for(int i = 0; i < 20000; i++) {
            sortedList.add(random.nextInt(10000));
        }

        sortedList.setSortStrategy(new BubbleSortAlgorithm());

        long startTime = System.nanoTime();
        sortedList.sort();
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;

        System.out.println(elapsedTimeInSecond + " seconds");
    }
}
