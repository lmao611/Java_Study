package Chap4;

public class student {
    private String name;
    private String studentID;
    private int age;

    //If you declare another constructor, you have to declare a blank one
    public student(){

    }
    public student (String name, String studentID, int age){
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public void learnJava() {
        System.out.println("This is a behavior of this student!");
    }
}