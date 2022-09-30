import java.util.*; // Program to create Rotate By 13 Encryption
public class ROT13 // Class Name
{
    String str,str1; // Data  Member
    int l;
    public ROT13() { // Default Constructor
        str=str1="";
        l=0;
    }
    public void input() { //Method to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        l = str.length();
    }
    public void encrypt() {  
        char ch,ch1; ch=ch1='\u0000';
        int i;       // local Variable
        if(l>3 && l<100) {
            for(i=0;i<l;i++) { // a loop till length of String.
               ch = str.charAt(i);
               if((ch>='A'||ch>='a') && (ch<='M'||ch<='m')) {
                   ch = (char)(ch+13);
                   str1 = str1 + ch;
                } else if((ch>='N'||ch>='n')&&(ch<='Z'||ch<='z')) {
                    ch = (char)(ch-13);
                    str1 = str1 + ch;
                } else {
                    str1 = str1 + ch;
                }
            }
            System.out.println("The Cipher text is: "+str1);
        } else {
            System.out.println("Invalid Length of String! ");
        }
    }
    public static void main() { // main Method
        ROT13 ob = new ROT13();
        ob.input();
        ob.encrypt(); // User-defined Method call
    }
}