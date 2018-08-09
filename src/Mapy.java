import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapy {
    public static void main(String[] args) {

        Map<Integer,String> people = new HashMap<>();
        people.put(123, "Jan Kowalski");
        people.put(345, "Anna Zawadzka");
        people.put(234, "Marcin Majewski");

        System.out.println(people.size());
        people.put(123, "Zenon Jaskulski");
        System.out.println();
        String s = people.get(345);
        System.out.println(s);

        Set<Integer> integers = people.keySet();
        System.out.println(integers);
        Collection<String> values = people.values();
        System.out.println(values);
        Set<Map.Entry<Integer, String>> entries = people.entrySet();
        System.out.println(entries);
    }
}
