import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        final Scanner sc = new Scanner(System.in);

        String[][] inputs = {
                { "1234", "1235", "3478", "1234", "5623", "5623" },
                { "1234", "1235", "3478", "1234", "5623", "5624", "0534", "5623", "4512", "3214" }
        };

        for (String[] input : inputs) {
            int counter = 0;
            boolean pin_code_coincided = false;

            for (String correct : input) {
                String vasya = sc.nextLine();
                counter++;

                if (correct.equals(vasya)) {
                    System.out.println("CORRECT");
                    pin_code_coincided = true;
                    break;
                } else {
                    System.out.println("INCORRECT " + counter);
                }
            }

            if (!pin_code_coincided) {
                System.out.println("Error");
                break;
            }
        }
    }
}