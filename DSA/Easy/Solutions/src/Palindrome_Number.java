import java.util.Scanner;
class Palindrome_Number {
    public boolean isPalindrome(int num){
        if (num == 0) return true;
        if (num < 0 || num%10 ==0) return false;
        int reversed = 0, comp = num;
        while(reversed < comp){
            reversed = reversed * 10 + comp % 10;
            comp /= 10;
        }
        return (reversed == comp || comp == reversed/10);
    }
    public static void main(String[] args) {
        System.out.printf("Enter your number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print(new Palindrome_Number().isPalindrome(num));
    }
}