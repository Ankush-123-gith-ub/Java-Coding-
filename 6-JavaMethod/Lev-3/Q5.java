
public class Q5 {
    public static void main(String[] args) {
        int n=9;
        System.out.println("Prime: "+isPrime(n));
        System.out.println("Neon: "+isNeon(n));
        System.out.println("Spy: "+isSpy(n));
        System.out.println("Automorphic: "+isAutomorphic(n));
        System.out.println("Buzz: "+isBuzz(n));
    }
    static boolean isPrime(int n){ if(n<2) return false; for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0) return false; return true; }
    static boolean isNeon(int n){ int sq=n*n,s=0; while(sq>0){s+=sq%10;sq/=10;} return s==n; }
    static boolean isSpy(int n){ int s=0,p=1; while(n>0){ int d=n%10;s+=d;p*=d;n/=10; } return s==p; }
    static boolean isAutomorphic(int n){ int sq=n*n,t=n; while(t>0){ if(sq%10!=t%10) return false; sq/=10;t/=10; } return true; }
    static boolean isBuzz(int n){ return n%7==0||n%10==7; }
}
