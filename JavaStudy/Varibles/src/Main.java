public class Main {
    public static void main(String[] args) {
        // Primitive and Reference
        // Pri: int, double, boolean, char
        // Ref: list, array, obj
        // Pri: a varible type hold org value
        // Ref: a varible point to an address, if 1 ref change then all the ref that have the same address changed too
        // Comparing example: Pri like bulbs that have independent flicks, while Ref have 1 switch connect to all.
        double GPA = 3.1;
        double BonusGPA = 1;
        GPA = GPA - Math.sin(GPA+BonusGPA-2);
        System.out.printf("%.2f \n", GPA);
        //Similar to C/C++, GML; double, boolean and char work quite the same
        String role = "Admin";
        System.out.println("Your role is: " + role);
        //Note: All of Ref varible should uppercase first letter, like String, Array,...
    }
}
