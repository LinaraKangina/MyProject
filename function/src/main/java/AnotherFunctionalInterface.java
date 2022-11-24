@FunctionalInterface
public interface AnotherFunctionalInterface {
    void someMethod();

    default void anotherMethod(){
        System.out.println("Default behavior");
    }
}
