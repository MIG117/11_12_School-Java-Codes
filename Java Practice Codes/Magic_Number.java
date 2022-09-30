import java.util.*;
public class Magic_Number
{
    int n,s;
    int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return n = sc.nextInt();
    }
    int magic(int nn) {
        int s=0,r;
        while(nn>0 || s>9) {
            if(nn==0) {
                nn=s;
                s=0;
            }
            r = nn % 10;
            s = s + r;
            nn = nn / 10;
        }
        return s;
    }
     void show(int in) {
        if(in==1)
            System.out.println("It is a Magic Number");
        else
            System.out.println("It is not a Magic Number ");
    }
    public static void main() {
        Magic_Number ob = new Magic_Number();
        int x = ob.input();
        int z = ob.magic(x);
        ob.show(z);
    }
}