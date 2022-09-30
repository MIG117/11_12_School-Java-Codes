import java.util.*;
public class SDA_Linear
{
    static Scanner sc = new Scanner(System.in);
    int n,arr[];
    public void input() {
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        arr = new int[n];
    }
    public void ele() {
        int i;
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
          arr[i] = sc.nextInt(); // Insertion of elements
    }
    public int occurs(int sear) {
        int i,j,count=0;
        for(i=0;i<n;i++) {
            if(arr[i]==sear)
                count++;
        }
        return count;
    }
     //     public int positions(int b) {
     //         int i,pos=0,arse=0;
     //         for(i=0;i<n-1;i++) {
     //             if(arr[i]==b) {
     //                  arse = arr[i+1];
     //             }
     //         }
     //         return arse;
     //     }
    public void Linear() {
        int i,j,index=0;
        for(i=0;i<n;i++) {
            index = arr[i];
            for(j=0;j<n;j++) {
                if(arr[j]==index) {
                    System.out.println(index+" = "+occurs(index));
                    break;
                }
            }
        }
    }
    public static void main(){
        SDA_Linear obj = new SDA_Linear();
        obj.input();
        obj.ele();
        obj.Linear();
    }
}