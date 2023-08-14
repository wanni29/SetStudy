import java.util.HashSet;
import java.util.Set;

public class SetStudy01 {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits.contains("Banana"));
        System.out.println(fruits.contains("Grape"));

        for (String fruit : fruits) {
            System.out.println(fruit);

        }

    }

}
