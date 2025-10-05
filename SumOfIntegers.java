import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by space:");
        String inputLine = scanner.nextLine();

        String[] inputs = inputLine.split(" ");

        for (String strNum : inputs) {
            int parsedNum = Integer.parseInt(strNum);
            numbers.add(parsedNum);
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        System.out.println("Sum of entered integers is: " + sum);
        scanner.close();
    }
}
