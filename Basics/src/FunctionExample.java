//import java.util.ArrayList;
//import java.util.List;
//
//public class Function {
//
//    // Function<T,R> - takes an input of type T and returns a value of type R
//    // It is a functional interface, meaning it can be used as the assignment target for a lambda expression or method reference.
//    // It is defined in java.util.function package.
//    // It has a single abstract method apply(T t) which takes an argument of type T and returns a value of type R.
//    // It can also have default and static methods.
//    // It is often used to transform data from one type to another.
//
//    // Example:
//    // Function<String, Integer> stringLength = str -> str.length();
//
//    //    FunctionalInterface
//
//    public static void main(String[] args) {
//
//        List<String> input = List.of("Hello", "World", "Java");
//
//        java.util.function.Function<String,Integer> transformer = str -> str.length();
//
//        List<Integer> lengths = mapStringsToLengths(input, transformer);
//
//        for(Integer length : lengths){
//            System.out.println(length);
//        }
//
//        java.util.function.Function<Integer,String> toBinary = (number) -> {
//            StringBuilder binary = new StringBuilder();
//            while(number > 0){
//                String bit = (number % 2 == 0) ? "0" : "1";
//                binary.append(bit);
//                number /= 2;
//            }
//            return new StringBuilder(binary.toString()).reverse().toString();
//        };
//
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<String> binaryNumbers = new ArrayList<>();
//
//        for(Integer number : numbers){
//            binaryNumbers.add(toBinary.apply(number));
//        }
//
//        for(String binary : binaryNumbers){
//            System.out.println(binary);
//        }
//
//        java.util.function.Function<Integer,Integer> multiplyBy2 = number -> number*2;
//        java.util.function.Function<Integer,Integer> square = number -> number*number;
//
//        System.out.println(multiplyBy2.andThen(square).apply(5)); // 100 -> first multiply by 2 then square the result
//        System.out.println(multiplyBy2.compose(square).apply(5)); // 50 -> first square the number then multiply by 2
//
//    }
//
//    static List<Integer> mapStringsToLengths(List<String> input, java.util.function.Function<String, Integer> transformer){
//        List<Integer> lengths = new ArrayList<>();
//        for(String str : input){
//            lengths.add((transformer.apply(str)));
//        }
//        return lengths;
//    }
//
//}
