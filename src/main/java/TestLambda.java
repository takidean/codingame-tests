import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

public class TestLambda {

    @Test
    public void testAction() {

        List<BlogPost> listOfStrings=new ArrayList<>();

        List listOtherAction= Arrays.asList("CA","EST","ESS","CSS");

        // listOfStrings.stream().anyMatch(x->x.getType().length()>10).

        listOfStrings.stream().collect(groupingBy(BlogPost::getType));

    }

    @Test
    public void testReduce() {

        List<Car> persons = Arrays.asList(new Car("Skoda", 18544),
                new Car("Volvo", 22344),
                new Car("Fiat", 23650),
                new Car("Renault", 19700));

        Optional<Car> car = persons.stream().reduce((c1, c2)
                -> c1.getPrice() > c2.getPrice() ? c1 : c2);


       List<Integer> listof= persons.stream().mapToInt(Car::getPrice).boxed() .collect(Collectors.toList());

       listof.forEach(System.out::println);

        IntStream.range(1, 10).reduce((x, y) -> x + y)
                .ifPresent(s -> System.out.println(s));

        car.ifPresent(System.out::println);
    }
    }


