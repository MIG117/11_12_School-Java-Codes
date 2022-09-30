import java.util.*;
class ar1
{
    Scanner sc=new Scanner(System.in);
    int n, index=0;
    int ar[];
    void create()
    {
        int s;
        System.out.println("\nEnter the no. of elements you want to enter");
        s=sc.nextInt();
        if(s>n)
        {
            System.out.println("\nArray size must be greater or equal to the elements you want to enter");
            System.exit(0);
        }
        else
        {
            System.out.println("\nEnter the elements\n");
            for(int i=0;i<s;i++)
            {
                ar[i]=sc.nextInt();
            }
            index=s;
        }
    }

    void insert()
    {
        int pos, val;
        System.out.println("\nEnter the position you want to insert in the array");
        pos=sc.nextInt();
        if(pos>n)
        {
            System.out.println("\nInvalid position specified. Please try again");
        }
        else
        {

            if((index < n) && (pos > index))
            {
                if((pos-index) == 1)
                {
                    System.out.println("\nEnter the value to be inserted");
                    val=sc.nextInt();
                    ar[pos-1]=val;
                    index++;
                }
                else
                {
                    System.out.println("\nInvalid position specified. Please try again");
                }
            }
            else
            {
                System.out.println("\nEnter the value to be inserted");
                val=sc.nextInt();
                if(pos==index)
                {
                    ar[pos-1]=val;
                }
                else
                {
                    int p=n-pos;
                    for(int i=n-1;i>=pos-1;i--)
                    {
                        ar[i+1]=ar[i];
                    }
                    ar[pos-1]=val;
                }
            }
        }
    }

    void del()
    {
        System.out.println("\nEnter the position from which you want to delete an element");
        int pos=sc.nextInt();
        if(pos>index)
        {
            System.out.println("\n Invalid Position specified. Please try again");
        }
        else
        {
            for(int i=pos-1;i<n;i++)
            {
                ar[i]=ar[i+1];
            }
            index--;
        }
    }

    void display()
    {
        if(index==0)
        {
            System.out.println("\nArray empty. No elements to display");
        }
        else
        {
            for(int i=0;i<index;i++)
            {
                System.out.println(ar[i]);
            }
        }
    }

    public void main()
    {
        System.out.println("\nEnter the size of the array\n");
        n=sc.nextInt();
        ar=new int[n+1];
        create();
        int ch;
        while(true)
        {
            System.out.println("\nEnter Choice\n1: Insertion\n2: Deletion\n3: Display\n4: Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                insert();
                break;
                case 2:
                del();
                break;
                case 3:
                display();
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("Enter a valid choice from the above list above");
                break;
            }
        }
    }
}