import java.util.*;
public class Unmerge
{
    static Scanner sc = new Scanner(System.in);
    int arr[],arr2[],arr3[],n;
    public Unmerge(int nn) {
        n = nn;
        arr = new int[n];
        arr2 = new int[n/2];
        arr3 = new int[n/2];
    }
    public static int input() {
        int x;
        System.out.println("Enter the size of array: ");
        return x = sc.nextInt();
    }
    public void element() {
        int i;
        for(i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        unmerge();
    }
    public void unmerge() {
        int i,j,k=0;
        for(i=0;i<(n/2);i++) {
            arr2[i] = arr[k++];
        }
        if(i==(n/2))
        k=0;
        for(j=(n/2);j<n;j++) {
            arr3[k++] = arr[j];
        }
        show();
    }
    public void show() {
        int j;
        System.out.println("The Original array: ");
        for(j=0;j<n;j++)
            System.out.print(arr[j]+" ");
        System.out.printf("%nThe unmerged array: %n");
        for(j=0;j<(n/2);j++)
            System.out.print(arr2[j]+" ");
        System.out.printf("%n");    
        for(j=0;j<(n/2);j++)
            System.out.print(arr3[j]+" ");    
    }
    public static void main() {
        Unmerge ob = new Unmerge(input());
        System.out.println("Enter the elements: ");
        ob.element();
    }
}