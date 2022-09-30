import java.util.*; // Program to conver decimal to Roman numbers
public class Roman // Class Name
{    
    static Scanner sc = new Scanner(System.in);
    int n;          // Data Member
    String str;
    String RomanNum[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int Decimals[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    
    public Roman() { // Default Constructor
        str="";
        n=0;
    }
    public int input() { // Member Function
         System.out.print("Enter a number within 4000: ");
         n=sc.nextInt();
         return(n);
    }
    public void roman(int num)
    {
        int i,j; // local Variable
        if(num<=4000) { 
            for(i=0;i<13;i++)
            {
                while(num>=Decimals[i])
                {
                    num = num-Decimals[i];
                    str=str+RomanNum[i];
                }
            }
            show(); // Print method call.
        } else {
            System.out.println("Invalid Input! ");
        }               
    } 
    public void show() { // Member Function
         System.out.print("Roman Equivalent: "+str);
    }
    public static void main()  // MAin Method
    {
        Roman obj = new Roman();        
        int x = obj.input();  // receving the integer from Member 
                                // function call
        obj.roman(x);
    }
}