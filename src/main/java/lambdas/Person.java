package lambdas;

/**
 * Created by Sinuhe_Jaime on 4/27/2017.
 */
public class Person {
    private final String name;
    private final int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
