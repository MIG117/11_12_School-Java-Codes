import java.io.*;
public class Perfect_No
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n,cp,s;
    
    public void input()throws IOException{
        System.out.println("Enter the number: ");
        n = Integer.parseInt(br.readLine());
        cp=n;
        perfect();
    }
    public void perfect() {
        int i;
        for(i=1;i<n;i++) {
            if(n%i==0) {
                s = s + i;
            }
        }
        show();
    }
    public void show() {
        if(s==cp) 
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number! ");
    }
    public static void main()throws IOException {
        Perfect_No ob = new Perfect_No();
        ob.input();
    }
}