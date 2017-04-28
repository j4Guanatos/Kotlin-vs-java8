package type_inf;

import java.util.Collections;
import java.util.List;

public class TypeInferance {
    public static void main(String[] args) {
        //Java 7
        foo(Collections.<String>emptyList());

        //Java 8
        foo(Collections.emptyList());
    }

    private static void foo(List<String> stringList) {

    }
}
