import java.util.function.Predicate;

public class ClassWithPredicate {
    public static void main (String [] args){

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                boolean da;
                if (integer > 0){
                    da = true;
                }else da = false;
                return da;
            }
            Boolean a = predicate.test(10);
            System.out.println (a);
        };
    }
}
