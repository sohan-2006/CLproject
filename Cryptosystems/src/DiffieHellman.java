import java.util.*;
class DiffieHellman
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a prime number \'q\'");
        int q=sc.nextInt();
        System.out.println("Enter the value of alpha such that it is a primitive root of the prime number \'q\' entered");
        int a=sc.nextInt();
        boolean flag=true;
        System.out.println("Enter the name of USER 1");
        String n1=sc.next();
        
        System.out.println("Enter the name of USER 2");
        String n2=sc.next();
        for(int i=1;i<q;i++)
        {
            if((((int)Math.pow(a,i))%q)<q)
            continue;
            flag=false;
        }
        if(!flag)
        {
            System.out.println("The entered value of alpha is not valid as it is not a primitive root of "+q+"!!!\nPlease Try Again");    
        }
        else
        {
            System.out.println("Heyy "+n1+" please enter your private key such that it is less than "+q);
            int Xa=sc.nextInt();
            System.out.println("Heyy "+n2+" please enter your private key such that it is less than "+q);
            int Xb=sc.nextInt();
            int Ya=((int)Math.pow(a,Xa))%q;
            int Yb=((int)Math.pow(a,Xb))%q;
            System.out.println("The public key for "+n1+" is "+Ya);
            System.out.println("The public key for "+n2+" is "+Yb);
            System.out.println("The final encryption key is:---- "+((int)Math.pow(Yb,Xa))%q);
        }
        sc.close();
    }
}