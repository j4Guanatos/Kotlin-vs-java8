package defaults;

public interface Defaults {
    default double fooMath(double x, double y){
        return Math.pow(x,y);
    }

    default void barSays(){
        System.out.println("Bar");
    }

    String baz();
}
