//import java.util.function.Consumer;
//import java.util.function.Supplier;
//
//public class ConsumerExample {
//    // A Consumer is a functional interface that takes an input and returns no result.
//    // It is often used for operations that perform actions on the input without returning a value.
//    // It can be used to process or consume data.
//
//    // Example:
//    // Consumer<String> printConsumer = str -> System.out.println(str);
//
//    public static void main(String[] args) {
//        Consumer<Integer> print = System.out::println;
//
//        print.accept(10);
//
//        Supplier<Integer> supplier = () -> 5;
//        System.out.println(supplier.get());
//
//        Supplier<Integer> randdomGenrerator = () -> (int) (Math.random() * 10);
//        System.out.println(randdomGenrerator.get());
//    }
//}
