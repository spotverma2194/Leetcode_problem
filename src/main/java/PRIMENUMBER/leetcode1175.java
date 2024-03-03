package PRIMENUMBER;
import java.util.*;
   //leet code  1175. Prime Arrangements
public class leetcode1175 {

    //remove static from every method / function
     static int mod=1000000007;
    public static long factorial(int n){
        long  ans=1;
        for(int i=2;i<=n;i++){
            ans=(ans%mod*i)%mod;
        }
        return ans;
    }
    public static int countPrimes(int n) {

        boolean[] sieve=new boolean[n+1];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(sieve[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                    sieve[j]=false;
                }
            }
        }
        int pn=0;
        for(int i=1;i<sieve.length;i++){
            if(sieve[i]){
                pn++;
            }
        }
        return pn;

    }
    public static int numPrimeArrangements(int n) {
        if(n==1) return 1;
        if(n==2 || n==3) return n-1;
        int pn=countPrimes(n);
        int cn=n-pn;
        long res=(factorial(pn)*factorial(cn))%mod;

        return (int)res ;
    }

    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(5));
    }
}
