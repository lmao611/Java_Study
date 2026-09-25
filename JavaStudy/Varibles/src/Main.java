public class Main {
    public static void main(String[] args) {
        // Primitive and Reference
        // Pri: int, double, boolean, char
        // Ref: list, array, obj
        // Pri: a varible type hold org value
        // Ref: a varible point to an address, if 1 ref change then all the ref that have the same address changed too
        // Comparing example: Pri like bulbs that have independent flicks, while Ref have 1 switch connect to all.
        double GPA = 3.1;
        double BonusGPA = 2.4;
        GPA = GPA - Math.sin(GPA+BonusGPA-1.5);
        System.out.println(GPA);
    }
}
