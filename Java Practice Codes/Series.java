import java.util.*;
public class Series
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i,n,s=0,f=1;
        
        System.out.println("Enter the range of Series: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++) {
            f = f * (i+1); // 1 = 1 * 2 => 2 
            if(i==n) {
                f = (f * (i+2));
                s = s + (f / i);
            } else {
                s = s +  f / i;
            }   
        }
        System.out.println("The Sum of Series: "+(s+1));    
        }
    }