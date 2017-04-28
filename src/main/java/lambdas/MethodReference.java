package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Sinuhe_Jaime on 4/27/2017.
 */
public class MethodReference {
    public static void main(String[] args) {
        List persons = new ArrayList();

        persons.add(new Person("Albert", 80));
        persons.add(new Person("Ben", 15));
        persons.add(new Person("Charlote", 20));
        persons.add(new Person("Dean", 6));
        persons.add(new Person("Elaine", 17));

        List allAges = listAllAges(persons, Person::getAge);



        allAges.forEach(age -> System.out.println(age));
        allAges.forEach(System.out::println);
    }


    private static List listAllAges(List person, Function<Person, Integer> f){
        List result = new ArrayList();
        person.forEach(x -> result.add(
                f.apply((Person)x)
        ));
        return result;
    }
}
