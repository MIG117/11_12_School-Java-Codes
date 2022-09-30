import java.util.*;
public class Armstrong
{
    int n,cpy;
    public Armstrong(int nn) { // Parameterised Constructor
        n = nn;
        cpy = n;
    }
    int arm() {
        int r,s=0,flag=0;
        while(n!=0) {
            n = n / 10;
            flag++;            
        }   System.out.println("flag: "+flag);
        n = cpy;
        while(n!=0) {
            r = n % 10;
            s = s + (int)(Math.pow(r,flag));
            n = n / 10;
        } System.out.println("s="+s);
        return s;
    }
    void check(int sn) {
        if(sn==cpy) {
            System.out.println("Its an Armstrong Number! ");
        } else {
            System.out.println("Its not an Armstrong Number! ");
        }
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        Armstrong obj = new Armstrong(x);
        obj.check(obj.arm());
    }
}