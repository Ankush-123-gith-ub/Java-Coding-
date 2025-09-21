
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        int n=12;
        int[] f=factors(n);
        System.out.println("Factors: "+Arrays.toString(f));
        System.out.println("Greatest: "+greatest(f));
        System.out.println("Sum: "+sum(f));
        System.out.println("Product: "+product(f));
        System.out.println("Product Cubes: "+productCubes(f));
    }
    static int[] factors(int n){ int c=0; for(int i=1;i<=n;i++) if(n%i==0) c++; int[] a=new int[c]; int k=0; for(int i=1;i<=n;i++) if(n%i==0) a[k++]=i; return a; }
    static int greatest(int[] a){ int m=a[0]; for(int x:a) if(x>m) m=x; return m; }
    static int sum(int[] a){ int s=0; for(int x:a) s+=x; return s; }
    static long product(int[] a){ long p=1; for(int x:a)p*=x; return p; }
    static long productCubes(int[] a){ long p=1; for(int x:a)p*=(int)Math.pow(x,3); return p; }
}
