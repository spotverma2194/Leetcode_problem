package PRIMENUMBER;
//hacker rank problem twins
import java.util.*;
public class twins {
    static ArrayList<Integer> sieve(int n){
        ArrayList<Integer> List=new ArrayList<>();
        boolean[] si=new boolean[n+1];
        si[0]=true;
        si[1]=true;
        for(int i=2;i<si.length;i++){
            if(si[i]==false){
                for(int j=i*i;j<si.length;j=j+i){
                    si[j]=true;
                }
            }
        }
        for(int i=0;i<si.length;i++){
            if(si[i]==false){
                List.add(i);
            }
        }
        return List;
    }
    public static int solve(int n, int m) {
        int ans=0;
        //1.make a root of m
        int rootm=(int)Math.sqrt(m);
        boolean[] arr=new boolean[m-n+1];
        //false-> prime ,true->not prime
        //2. get primt till root b using sieve
        ArrayList<Integer> primes=sieve(rootm);
        //3.marking using prime
        for(int prime: primes){
            //find starting index for marking
            int multiple=(int)Math.ceil((n*1.0)/prime);
            if(multiple==1)
                multiple++;
            int indx=multiple*prime-n;
            for(int j=indx;j<arr.length;j=j+prime){
                arr[j]=true; //mot prime
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false && i+n !=1){
                if(i+2<arr.length && arr[i+2]==false ){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter m");
        int m=sc.nextInt();
        System.out.println(solve(n,m));
    }
}
