package defaults;

public class MoreAndMoreThanDefaults implements Defaults {
    @Override
    public double fooMath(double x, double y) {
        return x - y;
    }

    @Override
    public void barSays() {
        System.out.println("More give me more");
    }

    @Override
    public String baz() {
        return "Yep";
    }
}
