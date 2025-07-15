//import java.util.function.BiConsumer;
//import java.util.function.BiFunction;
//import java.util.function.BiPredicate;
//import java.util.function.Function;
//
//public class BiExample {
//    public static void main(String[] args) {
//        // A BiFunction is a functional interface that takes two inputs and returns a result.
//        // It is often used for operations that combine two values to produce a new value.
//        // It can also have default and static methods.
//
//        // Example:
//        // BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
//
//        BiFunction<String,Double,String> biFunction = (name, salary) -> {
//            return name+ " earns " + salary + " dollars.";
//        };
//
//        Function<String,String> toUpperCase = String::toUpperCase;
//
//        System.out.println(biFunction.andThen(toUpperCase).apply("John", 50000.0));
//
//
//        BiFunction<Integer,Integer,String> formatTime = (hr,mins) ->{
//            return "Formatter Time : " + hr + " hr " + mins + " mins ";
//        };
//
//        System.out.println(formatTime.apply(3, 45));
//
//        // A BiPredicate is a functional interface that takes two inputs and returns a boolean result.
//
//        // It is often used for operations that perform actions on the inputs without returning a value.
//        BiPredicate<String,String> validator = (password, confirmPassword) -> {
//            return password.equals(confirmPassword) && password.length() >= 8;
//        };
//
//        System.out.println(validator.test("12345678", "12345678"));
//
//        BiPredicate<Integer,Double> isValid = (exp, rating) -> {
//            return exp >=3 && rating >= 4.5;
//        };
//
//        System.out.println(isValid.test(4, 4.8)); // true
//
//        // A BiConsumer is a functional interface that takes two inputs and returns no result.
//
//    }
//}
