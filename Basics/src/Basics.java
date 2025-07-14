import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

//class User {
//    int age;
//    boolean isActive;
//
//    User(int age, boolean isActive) {
//        this.age = age;
//        this.isActive = isActive;
//    }
//}

//class Basics {
    //         Java Stream API
    //         Functional Programming
    //                - Lambda Expression
//    public static void main(String[] args) {

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

//        Predicate<String> isValidEmail = (email) ->{
//            String regex = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
//            return Pattern.matches(regex, email);
//        };
//
//        List<String> emails = new ArrayList<>(List.of("abc@gmail.com","abc.com","1235$.com","qwert.in"));
//        printValidEmails(emails, isValidEmail);

//        Predicate<User> isValidVoter = user -> user.age >= 18;
//        Predicate<User> isActive = user -> user.isActive;
//
//        List<User> users = new ArrayList<>(List.of(new User(12,true), new User(18,false), new User(24,true)));
//        for(User user : users){
//            if(isValidVoter.and(isActive).test(user)){
//                System.out.println(user.age);
//                System.out.println(user.isActive);
//            }
//        }

//        Predicate<String> isEmpty = String::isEmpty;
//
//        List<String> names = new ArrayList<>(List.of("John","","Peter",""));
//
//        for (String name : names) {
//            if(isEmpty.negate().test(name)){
//                System.out.println(name);
//            }
//        }

//        List<String> names = new ArrayList<>(List.of("John","","Peter",""));
//        List<String> filteredNames = customFilter(names, name -> !name.isEmpty());
//        for(String name : filteredNames){
//            System.out.println(name);
//        }

//        Predicate<Integer> isInRange = number-> number >=10 && number <=50;
//        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50));
//        numbers.removeIf(isInRange);
//        for(int number : numbers){
//            System.out.println(number);
//        }

//        String name = "Sarthak";
//        String name1 = "Krishna";
//        if(customPredicate("Sar").test(name1)){
//            System.out.println(name1);
//        }else{
//            System.out.println("Prefix not matched");
//        }

//        Predicate<String> isPalindrome = data -> {
//            for(int i=0,j=data.length()-1;i<data.length()/2;i++,j--){
//                if(data.charAt(i) != data.charAt(j)){
//                    return false;
//                }
//            }
//            return true;
//        };
//
//        List<String> names = new ArrayList<>(List.of("John","Peter","Sarthak","Krishna","aaaa","madam","racecar","level","civic","radar",""));
//        names.removeIf(isPalindrome.negate());
//
//        names.forEach(System.out::println);


//    }

//    static Predicate<String> customPredicate(String prefix){
//        return val -> val.startsWith(prefix);
//    }
//    public static <T> List<T> customFilter(List<T> input, Predicate<T> condition){
//        Iterator<T> iterator = input.iterator();
//        while(iterator.hasNext()){
//            if(condition.negate().test(iterator.next())){
//                iterator.remove();
//            }
//        }
//        return input;
//    }


//    static void printValidEmails(List<String> emails,Predicate<String> isValidEmail){
//        for(String email : emails){
//            if(isValidEmail.test(email)){
//                System.out.println(email);
//            }
//        }
//    }

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
//}