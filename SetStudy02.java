import java.util.LinkedHashSet;
import java.util.Set;

public class SetStudy02 {
    public static void main(String[] args) {

        Set<String> colors = new LinkedHashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");

        for (String color : colors) {
            System.out.println(color);
        }

    }
}
