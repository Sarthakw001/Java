import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


class Basics {
    //         Java Stream API
    //         Functional Programming
    //                - Lambda Expression
    public static void main(String[] args) {

        // Predicates
//        Predicate<Integer> isEven = x -> x % 2 == 0;
//        System.out.println(isEven.test(10));

//        Predicate<String> isStartsWithA = name -> name.startsWith("A");
//        System.out.println(isStartsWithA.test("Apple"));

//        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        filterNumbers(numbers, isEven);
//
//        for(int number : numbers){
//            System.out.println(number);
//        }
    }

//    static void filterNumbers(List<Integer> numbers, Predicate<Integer> condition){
//        List<Integer> filteredList = new ArrayList<>();
//        for(int number : numbers){
//            if(condition.test(number)){
//                filteredList.add(number);
//            }
//        }
//        numbers.clear();
//        numbers.addAll(filteredList);
//
//        Iterator<Integer> iterator = numbers.iterator();
//        while(iterator.hasNext()){
//            if(!condition.test(iterator.next())){
//                iterator.remove();
//            }
//        }
//    }
}