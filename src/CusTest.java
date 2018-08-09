import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CusTest {
    public static void main(String[] args) {
        HashMap<Integer, Customer> customers = new HashMap<>();

        customers.put(123, new Customer(123, "Jan", "Kowalski", "12345678"));
        customers.put(345, new Customer(345, "Aneta", "Bogacka", "16743492"));
        customers.put(678, new Customer(678, "Adam", "Nowak", "982628740"));

        Set<Integer> integers = customers.keySet();
        System.out.println(integers);

        Collection<Customer> values = customers.values();

        for (Customer cust : values) {
            System.out.println(cust);

        }

    }
}
