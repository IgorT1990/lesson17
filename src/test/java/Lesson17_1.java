import java.util.Scanner;
public class Lesson17_1 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Name ");
            String Name = input.nextLine().toLowerCase();
            System.out.println("Enter you password");
            String password = input.nextLine().toLowerCase();
            input.close();

        }
    }
