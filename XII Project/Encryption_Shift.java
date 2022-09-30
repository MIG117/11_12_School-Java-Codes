import java.util.*; // Program to make encryption with user defined shift position
public class Encryption_Shift // Class Name
{
    static Scanner sc = new Scanner(System.in); // Scanner Class
    String str,str2;
    char ch;    // Data member
    int s;
    public Encryption_Shift() { //Default Constructor
        s = 0;
        str=str2="";
        ch='\u0000';
    }
    public void input() { // Member Function for taking input
        System.out.println("Enter the coded text: ");
        str = sc.nextLine();
        System.out.println("Enter the shift value: ");
        s = sc.nextInt();
    }
    public String encrypt() {  // Member Function to encrypt message
        int i,l,a; // local Variable
        if((s<1) || (s>26)) { 
            System.out.println("Invalid Shift Value");
        } else {
          l = str.length();
          for(i=0;i<l;i++) {
              ch = str.charAt(i);
              a = (int)ch + (s-1);
              if((char)a=='Q') {
                  if(str.charAt(i+1)+(s-1)=='Q'&& i<l) {
                  a = 32;
                  i++;
                }
              }
             if(a>90) {
                 a = a - 26;
             } 
             str2 = str2 + (char)a;
            }
        }
        return str2; // Returning the encoded text
     }
    public void show(String sr) { // Member Function to show the encoded text. 
        System.out.println("Decoded text: "+sr);
    }
    public static void main() {
        Encryption_Shift ob = new Encryption_Shift();
        ob.input(); // Member Function Call using object
        String sr = ob.encrypt();
        ob.show(sr);
    }
}