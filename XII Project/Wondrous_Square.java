import java.util.*;
public class Wondrous_Square
{
    static Scanner sc = new Scanner(System.in);
    int a[][],b[],n;
    public Wondrous_Square() {
        a = new int[10][10];
        b = new int[100];
    }
    public void input() {
        int i,j;
        double y;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the value of Wondrous Square ");
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                a[i][j] = sc.nextInt(); //taking input in 2D array
            }
        }
        System.out.println("INPUT MATRIX");
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
    public void wondrous() {
        int i,j,x1=1,x2=1,sum1,sum2,k,l,c;
        double y;
        for(i=1;i<=(n*n);i++) {
            b[i] = 0; //Assign SDA to 0
        }
        for(i=0;i<n;i++) {  // check validity of first condition
            for(j=0;j<n;j++) {
                if(b[a[i][j]]==0)
                    b[a[i][j]]=1;
                else
                    x1 = 0;
            }
        }
        if(x1==0)
            System.out.println("NOT WONDROUS SQUARE");
        else {
            y = 0.5 * n * (n*n+1);   // Checking validity of second condition
            for(i=0;i<n;i++) {
                sum1=0;
                sum2=0;
                for(j=0;j<n;j++) {
                    sum1 = sum1 + a[i][j];
                    sum2 = sum2 + a[j][i];
                }
                if(sum1!=y||sum2!=y) 
                x2=0;
            }
            if(x2==0)
            System.out.println("NOT WONDROUS SQUARE");
        } 
        if(x1==1 && x2==1)
            System.out.println("IT IS WONDROUS SQUARE ");
            System.out.println();
            System.out.println("PRIME \t ROW INDEX \t COLUMN INDEX");
            for(i=2;i<=(n*n);i++) {
                c=0;
                for(k=1;k<=i;k++) {
                    if(i%k==0) 
                        c++;
                }
                if(c==2) {
                    for(j=0;j<n;j++) {
                        for(l=0;l<n;l++) {
                            if(a[j][l]==i)
                                System.out.println(i+"\t\t"+j+"\t\t"+l);
                        }
                    }
                }
            }
    }
    public static void main() {
        Wondrous_Square obj = new Wondrous_Square();
        obj.input();
        obj.wondrous();
    }
}