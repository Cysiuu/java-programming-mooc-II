import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            int number = Integer.parseInt(scan.nextLine());
            if (number < 0) break;
            numbers.add(number);
        }
        numbers.stream().filter(n -> n >= 1 && n <= 5).forEach(System.out::println);
    }
}