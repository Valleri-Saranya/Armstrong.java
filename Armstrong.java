import java.util.Scanner;
class Armstrong
{
 public static void main(String []args)
{
  int n,sum=0,r,n1;
   double p,num=0;
   Scanner s= new Scanner(System.in);
    System.out.println("enter the number");
    n=s.nextInt();
     n1=n;
     while(n>0)
      {
       r=n%10;
      p=Math.pow(r,3);
       num=num+p;
      n=n/10;
      }
        if(num==n1)
        {
            System.out.println("armstrong");
         }
        else
            {
            System.out.println("not armstrong");
          } 
}
} 