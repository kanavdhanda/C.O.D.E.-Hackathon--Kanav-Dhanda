import java.util.*;
class q1
{
    public static void main(String args[])
    {
        Scanner jj=new Scanner(System.in);
        System.out.println("Please enter the String");
        String s=jj.nextLine();
        int length=s.length();
        System.out.println("Please enter the Alphabet you want to remove");
        char a=jj.next().charAt(0);
        String tm="";
        String y="";
        int length2=0;
        for(int z=0;z<length;z++)
        {
            char f=s.charAt(z);
        if(f!=a)
        {
            tm=tm+f;
         length2=tm.length();
        }
        for(int i=length2-1;i>=0;i--)
        {
            char c=tm.charAt(i);
            y=y+c;
        }
    }
        if(y.equals(tm))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("not pallindrome");
        }
    

        jj.close();
    }
}