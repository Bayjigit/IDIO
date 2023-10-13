import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> originalStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double percentage = 0.1;
        List<Integer> result = originalStream.collect(Collectors.toList());
        int newSize = (int) (result.size() * percentage);

        List<Integer> sampledElements = result.stream()
                .limit(newSize)
                .collect(Collectors.toList());

        System.out.println("Жыйынтык элементтер: " + sampledElements);
    }
}
