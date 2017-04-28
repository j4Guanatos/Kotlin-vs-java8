package streams;

import java.util.Optional;

/**
 * Created by Sinuhe_Jaime on 4/27/2017.
 */
public class Optionals {
    public static void main(String[] args) {
        Optional<String> couldBeOrNot = Optional.of("");

        //Lots of code in here...


        if(couldBeOrNot.isPresent()){
            String value = couldBeOrNot.get();
        }

        String anotherValue = couldBeOrNot.orElse("");
    }
}
