import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson3 {

    public static void main(String[] args) {
        //Задание 1

        String[] testArr = {"apple", "pineapple", "desk", "mirror", "apple",
                "car", "bike", "car", "java", "platform", "mourning",
                "summer", "winter", "desk"};

        Map<String, Integer> map = new HashMap<>();
            for (String s : testArr) {
                Integer count = map.getOrDefault(s, 0);
                map.put(s, count + 1);
            }
        System.out.println(map);

         //Задание 2

        TelephoneBook tb = new TelephoneBook();
        tb.add("Ivanov", Arrays.asList("+79111202309"));
        tb.add("Petrov", Arrays.asList("+79210019800", "+79213216767"));
        tb.add("Selivanov", Arrays.asList("+79531717922", "+79316709080"));
        tb.add("Gromov", Arrays.asList("+79111211231"));

        tb.test();
        tb.get("Ivanov");
    }
}

