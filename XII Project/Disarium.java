import java.util.*;  // Program to find Disarium Number using Recursion 
public class Disarium // Class Name 
{
    int n,size,cpy;
    public Disarium(int nn) { // Parameterised Constructor
        cpy=nn;
        n=nn;
        size=0;
    }
    public void Countdigits() { // Member Function
        int t = n;
        while(t>0) {
            size++;
            t = t / 10;
        }
    }
    public int Sumofdigits(int ns,int p,int dis) { // Member Function Parameterised 
        if(ns==0) 
           return dis;
        else {
            int d = ns % 10;
            dis = dis + (int) Math.pow(d,p);
            return (Sumofdigits(ns/10,p-1,dis)); // Recursive Call
        }
    }
    public void check() { // Member Function to check Disarium or not
        int ans=0; // local Variable
        ans = Sumofdigits(n,size,0);
        if(ans==cpy)
            System.out.println("Its a Disarium Number");
        else
            System.out.println("Not a Disarium Number");
    }
    public static void main() { // Main Method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n1 = sc.nextInt();
         Disarium ob = new Disarium(n1);
         ob.Countdigits();
         ob.check(); // Member function Call
    }
}   