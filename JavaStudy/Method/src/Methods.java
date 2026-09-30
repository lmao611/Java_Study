public class Methods {
    public static void main(String[] args) {
        /*
        modifier return-type method-name(<paras-list>){
            //statements
        }
         */
        mySelf();
        myLang("C/C++", 1);
        myLang("Java", 1);
        myLang("GML", 1);
        System.out.printf("your gpa is: %.2f", gpaCal(new String[]{"Cal2","DSA","OOP"},new double[]{70.0,80.0,78.0}));
    }
    //method with no para
    public static void mySelf(){
        System.out.println("My name is Pham Van Dai, I'm 19 years old");
    }
    //method with paras
    public static void myLang(String codeLang, int count){
        for(int i=0;i<count;i++){
            System.out.println((i+1) + ": " + codeLang);
        }
    }
    //method with return
    public static double gpaCal(String[] subjects, double[] scores){
        double sum = 0;
        for(int i=0;i<subjects.length;i++){
            sum += scores[i];
        }
        return (sum / subjects.length);
    }
}