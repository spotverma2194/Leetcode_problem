package PRIMENUMBER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Segmentsieve {
    static ArrayList<Integer> seive(int m){
        ArrayList<Integer> list=new ArrayList<>();
        int rm=(int)(Math.sqrt(m));
        boolean[] sev=new boolean[rm+1];
        Arrays.fill(sev,true);
        sev[0]=false;
        sev[1]=false;
        for(int i=2;i*i<=rm;i++){
            if(sev[i]==true){
                for(int j=i*i;j<=rm;j=j+i){
                    sev[j]=false;
                }
            }
        }
        for(int i=0;i<=rm;i++){
            if(sev[i]==true){
                list.add(i);
            }
        }
        return list;
    }
    static void segmentsiv(int n,int m){
        //1.make a array of m-n+1
        boolean[] arr= new boolean[m-n+1];
        //false-> prime number and true->non prime
        //2.generate prime from 2 to root m..(using sieve)
        ArrayList<Integer> primes=seive(m);
        for( int prime : primes){
            //3.starting multiple of prime from n
            int multiple=(int)(Math.ceil((n*1.0)/prime));
            if(multiple==1) multiple++;
            //4.starting index of prime nultiple
            int index=multiple*prime-n;
            //5.marking true for all multiples of prime
            for(int j=index;j<arr.length;j=j+prime){
                arr[j]=true; //not prime
            }
        }
        //6.print prime number form n to m
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false && i+n>1) {
                System.out.println(n+i);
            }
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting range");
        int n=sc.nextInt();
        System.out.println("enter ending index");
        int m=sc.nextInt();
        //creating a list to store all prime number form n to m
        ArrayList<Integer> list=seive(m);
        System.out.println(list);
        segmentsiv(n,m);
    }
}
