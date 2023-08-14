import java.util.Set;
import java.util.TreeSet;

public class SetStudy03 {

    public static void main(String[] args) {
        // 중복을 허용하지 않는다.
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(5);

        for (Integer number : numbers) {
            System.out.println(number);
        }

    }

}
