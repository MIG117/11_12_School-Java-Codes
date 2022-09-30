import java.util.*; // Java program to print a given number in words. 
public class Decimal_to_Words  // The program handles numbers from 0 to 9999 
{
    static Scanner sc = new Scanner(System.in); // Scanner Class 
     int n; // Data Member
     public Decimal_to_Words() { // Default Constructor
         n=0;
    }
    public void input() { // Member Function to take input
         System.out.println("Enter the number to convert in word: ");
         n = sc.nextInt();
    }
    public void deci_to_word() { // member Function to convert numbers to words
        int i,n1;
        int a[] = new int[4];
        String[] word = {"ONE","TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN","EIGHT", "NINE",
                            "TEN", "ELEVEN", "TWELVE","THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN","EIGHTEEN",
                            "NINETEEN", "TWENTY", "THIRTY", "FOURTY", "FIFTY","SIXTY", "SEVENTY","EIGHTY", "NINETY",
                            "HUNDRED", "THOUSAND"};
                            
        n1=n;i=4;
        while(n1>0) {
            a[--i] = n1 % 10;
            n1 = n1 / 10;
        }
        while(i!=0) {
            a[--i] = 0;
        }
        if(a[0]!=0) {
            System.out.print(word[a[0]-1]+" "+word[28]+" ");
        }
        if(a[1]!=0) {
            System.out.print(word[a[1]-1]+" "+word[27]+" ");
        }
        if(a[2]!=0) {
            if(a[2]>=2) {
                System.out.print(word[a[2]+17]+" ");
                if(a[3]!=0)
                    System.out.print(word[a[3]-1]);
            }
            if(a[2]==1) {
                System.out.print(word[a[3]+9]);
            }
        }
        else {
            if(a[2]==0 && a[3]!=0)
                System.out.print(word[a[3]-1]);
        }
    }
    public static void main() { // Main method
        
        Decimal_to_Words ob = new Decimal_to_Words(); // Object Creation
        ob.input();                    
        ob.deci_to_word(); // Member Function Call
    }
}