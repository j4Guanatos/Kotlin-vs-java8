package defaults;

public class MoreThanDefaults implements Defaults{
    @Override
    public void barSays() {
        System.out.println("More than defaults");
    }

    @Override
    public String baz() {
        return "Baz more";
    }
}
