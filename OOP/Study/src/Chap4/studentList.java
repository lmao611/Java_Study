package Chap4;

public class studentList {
    public static void main(String[] args) {
        System.out.println("The student list is:");
        student std1 = new student("Dai","ITITWE25002",19);
        System.out.println("Student: " + std1.getName() + "\nID: " + std1.getStudentID());
    }
}
