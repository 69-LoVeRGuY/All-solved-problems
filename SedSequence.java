import java.io.*;
import java.util.*;
public class SedSequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            if(sum%k==0)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}