import java.util.*; // Program to find Saddle point from a Matrix
public class Saddle_Point // Class Name
{
    static Scanner sc = new Scanner(System.in); // Scanner Class
    int arr[][],n,min,max;  // Data Member
    public Saddle_Point(int nn) { // Parameterised Constructor
        arr = new int[nn][nn];
        n = nn;
        max=0;
        min=0;
    }
    public void input() { // Member Function to take elements
        int i,j;
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void saddle() { // Member Function to find Saddle point
        int i,j,k,c=0,f=0; // local Variable
        for(i=0;i<n;i++) {
            min = arr[i][0];
            c=0;
            for(j=0;j<n;j++) {
            if(arr[i][j]<min) {
                min = arr[i][j];
                c=j;
            }
          }
          max = arr[0][c];
          for(k=0;k<n;k++){
              if(arr[k][c] > max) 
                  max = arr[k][c];
            }
            if(max==min) {
                System.out.println("Saddle Point No. "+max);
                f=1;
            }
        }
        if(f==0) {
            System.out.println("No Saddle Point No. in the Matrix");
        }
    }
    public void show() { // Member Function of output of Matrix
        int i,j;
        for(i=0;i<n;i++) {
            for(j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main() { // Main Method
        System.out.println("Enter the size of DDA more than 2 & less than 20: ");
        int z = sc.nextInt();
        Saddle_Point ob = new Saddle_Point(z);
        ob.input();
        ob.show(); // Member Function Call using Object
        ob.saddle();
    }
    }