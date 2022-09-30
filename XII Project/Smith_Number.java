import java.util.*; //Program to find Smith Number 
public class Smith_Number // Class Name
{
    static Scanner sc = new Scanner(System.in);
    public int SumDigit(int n) { // Member Function of Sum of digit
        int r,s=0;
        while(n>0) {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        return s;
    }
    public int SumPrimeFact(int n) { // Member Function for Sum of Factor
        int i=2,sum=0; // local Variable
        while(n>1) {
            if(n%i==0) {
                sum = sum + SumDigit(i); // Parameterised Method Call.
                n = n / i;
            } else {
                i++;
            }
        }
        return sum; // returning the sum
    }
    public static void main() { // Main Method
        Smith_Number ob = new Smith_Number();
        System.out.println("Enter a Number: ");
        int n1 = sc.nextInt();
        int a = ob.SumDigit(n1);
        int b = ob.SumPrimeFact(n1); // Member Function calling using object
        if(a==b) 
            System.out.println("Smith Number");
        else 
            System.out.println("Not Smith Number");
    } // End of main
} // End of class