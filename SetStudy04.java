import java.util.LinkedHashSet;
import java.util.Set;

public class SetStudy04 {

    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        Runnable prinNumberTask = () -> {
            StringBuilder resultBuilder = new StringBuilder("Even Numbers: ");

            numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .forEach(n -> resultBuilder.append(n).append(", "));

            resultBuilder.delete(resultBuilder.length() - 2, resultBuilder.length());

            System.out.println(resultBuilder);
        };

        Thread thread = new Thread(prinNumberTask);
        thread.start();
    }

}
