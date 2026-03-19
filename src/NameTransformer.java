import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class NameTransformer {
    public static List<String> removeFirstLetterAndSort(List<String> names) {
        return names.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty())
                .map(name -> name.substring(1))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Дарья", "", "Иван", "Петр", null);
        List<String> result = removeFirstLetterAndSort(names);
        System.out.println(result);
    }
}
