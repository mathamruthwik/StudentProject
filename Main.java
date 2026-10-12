import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " +
            (marks >= 40 ? "PASS" : "FAIL"));

        sc.close();
    }
}