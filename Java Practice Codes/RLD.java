import java.util.*;
public class RLD
{
    static Scanner sc = new Scanner(System.in);
    int arr[][] = { {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16},};
    int n;
    int ar[] = {1,2,3,4,5};
    public RLD(int b) {
       
       n = b;
    }
    public void input() {
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void RD() {
        int i,j;
        System.out.println("Printing Right Diagnol");
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                if((i+j)==3) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public void LD() {
        int i,j;
        System.out.println("Printing left Diagnol");
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                if(i==j) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public void LRD() {
        int i,j;
        System.out.println("Printing Right and Left Diagnol");
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                if((i==j)||(i+j)==3) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main() {
        RLD ob = new RLD(4);
        ob.input();
        ob.RD();
        ob.LD();
        ob.LRD();
    }
}