package lambdas;

public class WorkLambdas {
    public static void main(String[] args) {
        // Be expresive!
        foo(new SAMInterface() {
            @Override
            public void doWork(long data) {

            }
        });

        //OR use lambdas! That also express ideas!
        foo((long data) -> {
            //Do something
        });


        bar(new FSAMInterface() {
            @Override
            public void doTheThing(int[] magicValues) {
                foo(x -> {

                });
            }
        });
        bar((int[] magicValues) -> {

        });


        Runnable r = () -> System.out.println("Hello runnable");
    }


    private static void foo(SAMInterface samInterface) {
        //... foo
    }

    private static void bar(FSAMInterface fsamInterface) {
        //... bar
    }
}
