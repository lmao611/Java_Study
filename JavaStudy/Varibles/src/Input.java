import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // set scanner for input

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //read the input into varible "name", btw next() will read til space
        //String Read
        System.out.println("Hello "+name);
        //Int Read
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();//next+type_input() except String
        System.out.println("You are "+age+" YOs");

        //Double
        System.out.print("Your GPA: ");
        double GPA = scanner.nextDouble();
        System.out.println("Your GPA is: "+GPA);
        scanner.close(); //close the scaner
    }
}