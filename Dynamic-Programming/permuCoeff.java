import java.util.*;
public class permuCoeff
{
    public static int number(int n, int k)
    {
        //Always make index as n+1
        int[] fact = new int[n+1];
        fact[0]=1; // Base Case
        for(int i=1;i<n+1;i++)
        {
            fact[i]=fact[i-1]*i;
            //Building the problem
        }
        return fact[n]/fact[n-k];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(number(n, k));

    }
}