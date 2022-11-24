import java.util.function.Consumer;

public class ClassWithConsumer {
    public static void main (String [] args){
        Consumer <String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        //String jk = consumer.accept(consumer);
    }
}