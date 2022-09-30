import java.io.*; // Program to sort words in decending order
public class Sort_Sentences
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word[];
    char ch;
    int n;
    String str,temp; // Data Member
    public Sort_Sentences() { // Default Constructor
        word = new String[50];
        ch='\u0000';
        n=0;
        str=temp="";
    }
    public void input()throws IOException { // User Defind Function
        System.out.println("Enter the sentence and end with fullstop: ");
        str = br.readLine().trim();
        str.toLowerCase();
    }
    public void Sen_sort() { // User Defind Function
        int a,i,j,c,l,k;                // local Variable
        l = str.length();
        for(a=0;a<l;a++) {
            if(str.charAt(a)!=' ' && str.charAt(a)!='.') {
                temp = temp + str.charAt(a);
            } else {
                word[n++] = temp;
                temp="";// reset
            }
        } // end of loop
        for(i=0;i<n-1;i++) { 
            for(j=(i+1);j<n;j++) {
                if(word[i].length()<word[j].length()) {
                    temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
                if(word[i].length()==word[j].length()) {
                    if(word[i].compareTo(word[j])>0) {
                        temp = word[i];
                        word[i] = word[j];
                        word[j] = temp;
                    }
                }
            } // end of Loop 1
        } // end of loop 2
    }
    public void show() { // User Defind Function
         System.out.println("\nThe word present in sentence are arranged in decending order.");
         for(int k=0;k<n;k++) {
            ch = word[k].charAt(0);
            ch = Character.toUpperCase(ch);
            word[k] = ch + word[k].substring(1);
            System.out.print(word[k]+" ");
        } // End of k loop
        System.out.print("."); // To be printed at end of sentence.
    }
    public static void main()throws IOException {
        Sort_Sentences obj = new Sort_Sentences();
        obj.input();
        obj.Sen_sort(); // Method call
        obj.show();                                
    }
}