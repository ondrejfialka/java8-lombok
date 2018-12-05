package cz.ucl.jse.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamingAPI {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(-1);
        numbers.add(3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(1);

        List<Integer> negativeList = numbers.stream()
                .filter(number -> number < 0)
                .collect(Collectors.toList());

        int sum = numbers.stream()
                .filter(number -> number > 0)
                .mapToInt(i -> i.intValue())
                .sum();

        List<Integer> negativeList2 = numbers.stream()
                .filter(number -> number < 0)
                .sorted()
                .collect(Collectors.toList());

        Map<String, Integer> mapOfNumbers = numbers.stream()
                .collect(Collectors.toMap(number -> String.valueOf(number), number -> number));


        List<Integer> modifiedList = mapOfNumbers.values().stream()
                .map(number -> number + 2)
                .collect(Collectors.toList());

    }

}
