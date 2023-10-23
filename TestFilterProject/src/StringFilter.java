import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static List<String> filterStrings(List<String> stringList) {
        List<String> filteredList = stringList.stream()
                .filter(str -> str.startsWith("a") && str.length() == 3)
                .collect(Collectors.toList());

        return filteredList;
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "ant", "app",  "air", " amp", "banana", "apricot", "cherry", "avocado");

        List<String> filteredStrings = filterStrings(stringList);

        System.out.println("Strings that start with 'a' and have 3 letters: " + filteredStrings);
    }
}
