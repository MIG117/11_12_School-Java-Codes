import java.util.*; // import of Scanner Class
public class Kaprekar_Number // Class Name
{
    static Scanner sc = new Scanner(System.in); 
    int num,s; // Global Variable
    public Kaprekar_Number(int nn) { // parameterised Constructor
        num = nn;
        s = 0;
    }
    int kaprekar() { // Member Function
        int sq,sm=0,digit=0,p,k; // Local Variable
        sq = num * num;
        p = sq;
        while(sq>0) {
            digit++;
            sq = sq / 10;
        }
        k = (int)Math.pow(10,(digit/2));
        while(p>0) {
            sm = sm + (p%k);
            p = p / k;
        } 
        s = sm;
        return s;
    }
    void show() { // Member Function
        if(num==s) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not Kaprekar Number");
        }
    }
    public static void main() { // main Method 
        int n; // Member Function
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Kaprekar_Number obj = new Kaprekar_Number(n); // Creating Object
        obj.kaprekar(); // Object Calling
        obj.show();
    }
}