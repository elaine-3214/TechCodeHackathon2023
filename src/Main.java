import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Are you a student (y/n)");
        String ans = scan.nextLine();
        boolean isStudent;
        if (ans.equals("y")) {
            isStudent = true;
        } else if (ans.equals("n")) {
            isStudent = false;
        }
    }
}