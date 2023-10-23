import java.util.List;
import java.util.stream.Collectors;

public class StringFilterInternship {

    public static List<String> filterStringsStartingWithAAndLength3(List<String> stringList) {
        List<String> filteredList = stringList.stream()
                .filter(str -> str.startsWith("a") && str.length() == 3)
                .collect(Collectors.toList());

        return filteredList;
    }

    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = List.of("apple", "banana", "apricot", "cherry", "avocado");

        // Filter and display the result
        List<String> filteredStrings = filterStringsStartingWithAAndLength3(stringList);

        System.out.println("Filtered strings (start with 'a' and have 3 letters): " + filteredStrings);
    }
}