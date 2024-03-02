package PRIMENUMBER;
import java.util.ArrayList;
import java.util.Scanner;

public class tofindprimenumbers {
    //using brute force approach
    //primality test
    static boolean checkprime(int n){
        boolean flag=true;
        for(int i=2;i<(int)Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    static ArrayList<Integer> primenumber(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(checkprime(i)){
                ans.add(i);
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(primenumber(n));

    }
}
