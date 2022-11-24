import java.util.function.Function;

public class ClassWithFunction {

    public static void main (String [] args){

        Function<Integer, String> convert = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };
    }
}
