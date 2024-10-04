import java.io.; import java.util.; import java.text.; import java.math.; import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();

        System.out.println(check(n));
    }
}

public static long check(int n)
{

    long a=1;

    //finding the lcm of all numbers till n to get answer
    for(long b=2;b<=n;b++)
    {            
        a= lcm(b,a);
    }

    return a;


}

public static long lcm(long a,long b)
{

    long z=a<b?a:b;

    while(true)
    {
        if(z%a==0 && z%b==0)
        return z;
        z++;
    }
}
}
