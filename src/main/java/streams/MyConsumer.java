package streams;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
