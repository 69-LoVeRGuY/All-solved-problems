import java.io.*;
import java.util.*;
public class XORwise
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(((a^Math.min(a,b))+(b^Math.min(a,b))));
        }
    }
}