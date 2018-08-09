import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ZbiorIter {

    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Jan","Kowalski"));
        people.add(new Person("Jan","Kowalski"));
        people.add(new Person("Anna","Zawadzka"));
        people.add(new Person("Karol","Majewski"));

        System.out.println(people.size());

//        Iterator<Person> iterator = people.iterator();
//        while(iterator.hasNext()){
//            Person next = iterator.next();
//            System.out.println(next);
//        }
        
        for( Person person : people){
            System.out.println(person);
        }
    }

}
