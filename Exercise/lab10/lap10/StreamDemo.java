package lap10;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anu","James","Smith");

        names.stream().filter(name ->name.startsWith("A")).forEach(name -> System.out.println(name));

        names.stream().filter(name ->name.startsWith("A")).distinct().forEach(name -> System.out.println(name));

        List<String> filterName = names.stream().filter(name -> name.length() > 5).collect(Collectors.toList());

        System.out.println(filterName);

        names.stream().map(String :: toUpperCase).forEach(System.out::println);
    }
}
