import java.util.*;
public class Goldbach // class name
{
    static Scanner sc = new Scanner(System.in); // Scanner class
    int arr[],n,cpy;  // Data Member
    public Goldbach() { // default constructor
        arr = new int[20];
        n=cpy=0;
    }
    public void input() { // Member Function
        System.out.println("Enter a number more than 9 & less than 50: ");
        n = sc.nextInt();
        cpy = n;
    }
    public void bach() {    // Member Function
        int i,j,c=0,k=0,s=0,s1=0;
        if(n>9 && n<50) {
            if(n%2==0) {
                for(i=3;i<n;i=i+2) {
                    for(j=1;j<=i;j++) {
                        if(i%j==0) 
                        c++;        // Counter
                    }
                    if(c==2) {
                        arr[k++]=i;
                        c=0;
                    } else {
                        c=0;
                    }
                } //for
                System.out.println("Prime Factors : "); //Printing Prime Factors
                for(i=0;i<k;i++) {
                    for(j=i;j<k-1;j++) {
                        s = arr[i] + arr[j];
                        if(cpy==s)
                            System.out.print(arr[i]+","+arr[j]);
                    }
                    System.out.println();
                } //for
            } else { 
                System.out.println("Number is ODD");
            } //else 
        } else {
            System.out.println("Number is Out of Range");
        }
    }
    public static void main() { // main method
        Goldbach obj = new Goldbach();  // Creating Object
        obj.input();  // object calling
        obj.bach();
    }
}