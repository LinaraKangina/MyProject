import java.util.function.Supplier;

public class ClassWithSupplier {
    public static void main (String [] args){
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        };
    }
}
