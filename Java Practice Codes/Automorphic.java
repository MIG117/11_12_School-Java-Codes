import java.util.*;
public class Automorphic
{
    int cpy=0;
    public int auto(int nn) {
        int r,s=0,m,c=0,z=0;
        double d=0.00;
        cpy = nn;
        m = nn * nn;
        while(nn>0) {
            c++;
            nn = nn / 10;
             if(nn==0) {
                d = Math.pow(10,c);
                z = m % (int)d;
                System.out.println("z: "+z);
                break;
            }
        }
        return z;
    }
    public void check(int x) {
        if(x==cpy)
            System.out.println("Automorphic Number! ");
        else
            System.out.println("Not Automorphic Number! ");
    }
    public static void main(String args[]) {
        Automorphic ob = new Automorphic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        ob.check(ob.auto(a));
    }
}