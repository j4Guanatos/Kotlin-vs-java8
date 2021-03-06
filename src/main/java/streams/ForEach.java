package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        //creating sample Collection
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }

        //traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::" + t);
            }
        });
        //as we know... we can use lambdas
        myList.forEach(t -> System.out.println("forEach anonymous class Value::" + t));
        //or method reference.
        myList.forEach(System.out::println);

        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        //The problem?
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        //array.forEach()
        List<Integer> arrayList = Arrays.asList(array);
        arrayList.forEach(action);
    }

}
