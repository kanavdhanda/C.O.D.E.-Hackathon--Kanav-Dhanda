import java.util.*;
 class q5 {

    public static void main(String[] args) {

    	Scanner jj=new Scanner(System.in);
        int num1 =jj.nextInt();
        int num2= jj.nextInt();
        int gcd = 1;

        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
        
    jj.close();
    }

}