import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        list.add("6");
//
//        list.forEach(s -> System.out.println(s));

//        List<User> list = new ArrayList<>();
//        list.add(new User(1, "a"));
//        list.add(new User(7, "a"));
//        list.add(new User(9, "h"));
//        list.add(new User(2, "a"));
//        list.add(new User(0, "d"));
//        list.add(new User(6, "j"));

        // change the root list
        //list.sort((l1, l2) -> l1.getId() - l2.getId()); // sort by lamda expresson
        //list.sort((l1, l2) -> l1.getName().compareTo(l2.getName()));
        // .stream() return a new thread contain the sorted element, hato collect to list new list;
        //List<User> list1 =  list.stream().sorted((l1, l2) -> l1.getId() - l2.getId()).collect(Collectors.toList());
        // or we can use forech to loop through element in thread and print it in console;
        //list.stream().sorted((l1, l2) -> l1.getId() - l2.getId()).forEach(s -> System.out.println(s));
        //list1.forEach(s -> System.out.println(s.toString()));\

//        // advance sort
//        list.stream().sorted((l1,l2) -> {
//            if(l1.getName().compareTo(l2.getName()) < 0){
//                return -1;
//            }else if(l1.getName().compareTo(l2.getName()) > 0){
//                return 1;
//            }else {
//                return l1.getId() - l2.getId();
//            }
//        }).forEach(s -> System.out.println(s));


//        Map<Integer, User> map = new HashMap<>();
//        map.put(1, new User(1, "a"));
//        map.put(2, new User(9, "a"));
//        map.put(3, new User(7, "a"));
//        map.put(4, new User(4, "a"));
//
//        map.forEach((k,v) -> System.out.println(k + " - " + v.toString()));

//        Set<Double> set = new HashSet<>();
//        set.add(1d);
//        set.add(6d);
//        set.add(2d);
//        set.add(4d);
//        set.stream().sorted();
//        set.forEach(s -> System.out.println(s));
//        //set.forEach(s -

        Set<User> users = new HashSet<>();
        users.add(new User(5, "a"));
        users.add(new User(2, "g"));
        users.add(new User(0, "c"));
        users.add(new User(3, "f"));
        users.forEach(s -> System.out.println(s));
        System.out.println("after sort: ");
        users.stream().sorted((u1, u2) -> u1.getId() - u2.getId()).forEach(s -> System.out.println(s));

    }
}