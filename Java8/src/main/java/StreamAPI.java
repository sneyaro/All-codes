import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args)
    {
        List<Integer> number = Arrays.asList(1, 2, 4, 6, 7,5, 8,13);

        //Stream<Integer> data = number.stream();
        //Stream<Integer> mappedData = number.stream().map(number1-> number1*3);
        //mappedData.filter(number1->number1%2==1).sorted().forEach(number1->System.out.println(number1));

        System.out.println("Original Data:");
        number.forEach(System.out::println);


        System.out.println("Transformed Data:");
        Stream<Integer> mappedData = number.stream().map(number1 -> number1 * 3);
        mappedData.filter(number1 -> number1 % 2 == 1)
                .sorted()
                .forEach(System.out::println);
        //Stream<Integer> data = number.stream();
        //Stream<Integer> flatMappedData = number.stream()
                //.flatMap(number1 -> number.stream().map(number2 -> number1 * 3));

        //flatMappedData.forEach(System.out::println);

        // Stream<Integer> sortedData = data.sorted();
        //sortedData.forEach(number1->System.out.println(number1));

        //long count= data.count();
        //System.out.println(count);

        //data.forEach(number1 -> System.out.println(number1));
    }
}
