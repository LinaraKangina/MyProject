@FunctionalInterface
public interface Converter<Cat, Dog> {
    Dog convert (Cat c);
}
