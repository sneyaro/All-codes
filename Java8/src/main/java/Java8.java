
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 7, 5, 8, 13);


        FilterClass filterClass = new FilterClass();
        List<Integer> filteredNumbers = filterClass.filterOddNumbers(numbers);
        System.out.println("Filtered Odd Numbers:");
        filteredNumbers.forEach(System.out::println);


        StreamClass streamClass = new StreamClass();
        Stream<Integer> numberStream = streamClass.createStream(numbers);
        System.out.println("Stream of Numbers:");
        numberStream.forEach(System.out::println);


        MapClass mapClass = new MapClass();
        List<Integer> mappedNumbers = mapClass.mapTriple(numbers);
        System.out.println("Mapped Numbers (Triple):");
        mappedNumbers.forEach(System.out::println);


        LambdaFunctionClass lambdaFunctionClass = new LambdaFunctionClass();
        System.out.println("Printing Numbers using Lambda:");
        lambdaFunctionClass.printUsingLambda(numbers);


        FlatMapClass flatMapClass = new FlatMapClass();
        List<Integer> flatMappedNumbers = flatMapClass.flatMapAndTriple(numbers);
        System.out.println("FlatMapped Numbers:");
        flatMappedNumbers.forEach(System.out::println);
    }
}

class FilterClass {
    public List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 1)
                .collect(Collectors.toList());
    }
}

class StreamClass {
    public Stream<Integer> createStream(List<Integer> numbers) {
        return numbers.stream();
    }
}

class MapClass {
    public List<Integer> mapTriple(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * 3)
                .collect(Collectors.toList());
    }
}

class LambdaFunctionClass {
    public void printUsingLambda(List<Integer> numbers) {
        numbers.forEach(number -> System.out.println(number));
    }
}

class FlatMapClass {
    public List<Integer> flatMapAndTriple(List<Integer> numbers) {
        return numbers.stream()
                .flatMap(number -> Stream.of(number, number * 3))
                .collect(Collectors.toList());
    }
}
