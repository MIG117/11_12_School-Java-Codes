import java.util.*; // Program to insert,delete,sort,search as per user choice
public class menu_driven_SDA // Class Name
{
    static Scanner sc = new Scanner(System.in);
    int i,j,temp,arr[],arr2[];    // Data Member
    public menu_driven_SDA(int num) {   // Constructor
        i=j=temp=0;
        arr = new int [num];
        arr2 = new int[50];
    }
    public void elements() { // Method to insert elements to array
        System.out.println("Enter the elements: ");
        for(i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }
    public int input() { // Method to make choice.
        int ch=0; // local variable.
        System.out.println("Enter your choice: ");
        System.out.println("1  To insert  an element into SDA.");
        System.out.println("2. To delete an element from SDA. ");
        System.out.println("3. To search an element from SDA. ");
        System.out.println("4. To sort elemets into SDA. ");     
        ch = sc.nextInt();
        return(ch);
    }
    public void insert() { // Method to insert a element in the SDA
        int i,ele,pos,n=arr.length;
        for(i=0;i<arr.length;i++) 
            arr2[i] = arr[i];
        System.out.println("Enter the element to be inserted: ");
        ele = sc.nextInt();
        System.out.println("Enter the position of insertion: ");
        pos = sc.nextInt();
        for(i=n-1;i>=pos-1;i--) {
            arr2[i+1] = arr2[i];
        }
        arr2[pos-1] = ele;
        System.out.println("Array after Insertion ");
        for(i=0;i<arr.length+1;i++) {  //Printing of SDA
           if(i==arr.length) {
            System.out.print(arr2[i]+"");
            break;
        }
            System.out.print(arr2[i]+",");
        }
    }
    public void delete() { // Method to delete a element from the SDA
        int pos,i,n=arr.length;
        for(i=0;i<n;i++) 
            arr2[i] = arr[i];
        System.out.println("Enter the position to be deleted: ");
        pos = sc.nextInt();
        for(i=pos;i<n;i++) 
            arr2[i-1] = arr2[i];
        n--;    
        System.out.println("Array after deletion ");
        for(i=0;i<arr.length-1;i++) {  // Printing of SDA
           if(i==arr.length-2) {
            System.out.print(arr2[i]+"");
            break;
           }
            System.out.print(arr2[i]+",");
        }
    }
    public void search() {
        sort(); // Binary search needs to be sorted before executing.
        int k,mid,lb,ub,ns; k=lb=ns=0; 
        ub = arr.length-1;
        System.out.println("Enter the value to be searched using binary search: ");
        ns = sc.nextInt();
        while(lb<=ub) {
            mid = (lb+ub) / 2;
            if(arr[mid]<ns) {
                lb = mid + 1;
            }
            if(arr[mid]>ns) {
                ub = mid - 1;
            }
            if(arr[mid]==ns) {
                k = 1;
                break;
            }
        }
        if(k==1) {
            System.out.println("Search Found! ");
        } else {
            System.out.println("Search Not Found ");
        }
    }
    public void sort() {    
        for(i=0;i<arr.length-1;i++) {     // Bubble Sort Technique
            for(j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void show() { // Method to show the final output.
        for(i=0;i<arr.length;i++) {
            if(i==arr.length-1) {
                System.out.print(arr[i]+" ");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }
    public void show2() {
        for(int i=0;i<arr.length+1;i++) { 
           if(i==arr.length) {
            System.out.print(arr2[i]+"");
            break;
        }
            System.out.print(arr2[i]+",");
        } 
    }
    public static void main(String args[]) { 
        int c=0,sz;
        System.out.println("Enter the size of SDA: ");
        sz = sc.nextInt();
        menu_driven_SDA obj = new menu_driven_SDA(sz);
        obj.elements();
        c = obj.input();
        switch(c) {     // Methods will be called as per the user choice.
            case 1: obj.insert();
                    break;
            case 2: obj.delete();
                    break;
            case 3: obj.search();
                    obj.show();
                    break;
            case 4: obj.sort();
                    obj.show();
                    break;
            default: System.out.println("Invalid Input! ");
        }
    }
}