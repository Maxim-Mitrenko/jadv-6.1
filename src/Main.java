import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<String, List<String>> function = x -> Arrays.stream(x.split(" "))
                .sorted(Comparator.naturalOrder())
                .toList();
        List<String> list = function.apply("Авьвов впппаа вовравпап аалваа аапвпвпн ааыывщш");
        System.out.println(list);
    }
}
