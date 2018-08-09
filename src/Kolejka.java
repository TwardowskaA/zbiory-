import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {
        Queue<Person> clients = new LinkedList<>();
        clients.offer(new Person("Jan", "Kowalski", "1234567890"));
        clients.offer(new Person("Anna", "Zawadzka", "2345678901"));
        clients.offer(new Person("Wojciech", "Abacki", "3456789012"));

        while (!(clients.isEmpty())) {
            System.out.println(clients.peek() + "proszony do gabinetu");
            System.out.println(clients.poll() + "obsluzony");
        }

    }
}
