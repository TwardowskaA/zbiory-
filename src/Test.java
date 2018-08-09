import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("liczby.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        TreeSet<Integer> numbers = new TreeSet<>();

        Scanner scan = new Scanner(file);
        int ilosc = 0;
        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
            ilosc++;
        }
        int size = numbers.size();

        System.out.println(ilosc);
        System.out.println("Ilosc unikalnych liczb" + " " + size);
        System.out.println(numbers);
        System.out.println("Najmniejsza" + " " + numbers.first());
        System.out.println("Najwieksza" + " " + numbers.last());
    }

}


