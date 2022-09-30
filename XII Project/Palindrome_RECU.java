import java.util.*;
public class Palindrome_RECU // Class Name
{
    int num,rev; // Data Member
    public Palindrome_RECU() { // default constructor
        num = 0;
        rev = 0;
    }
    public void accept() { // Member Function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }
    public int reverse(int p) { // Parameterised Member Function
        if(p>0) {
            rev = rev * 10 + (p%10);
            return reverse(p/10);
        } else {
            return rev;
        }
    }
    public void check() { // Member Function
        int x = num; // local Variable
        if(num==reverse(x)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
    public static void main() {
        Palindrome_RECU obj = new Palindrome_RECU(); // Object Creation
        obj.accept(); // Object Calling
        obj.check();
    }
}