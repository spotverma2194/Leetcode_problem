package PRIMENUMBER;

import java.util.*;
public class sievemethod {
    static ArrayList<Integer> sieve(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        //create n+1 size of boolean array
        boolean[] sie=new boolean[n+1];
        //fill with true
        Arrays.fill(sie,true);
        // 0 and 1 is not prime
        sie[0]=false;
        sie[1]=false;

        for(int i=2;i<(int)Math.sqrt(n);i++){
            if(sie[i]==true){
                //mark factors of i as false
                for(int j=i*i;j<=n;j=j+i){
                    sie[j]=false;
                }
            }
        }
        //adding prime number to list
        for(int i=2; i< sie.length;i++){
            if(sie[i]){
                ans.add(i);
            }
        }
        return ans;
    }
    //time  complexity : O(n(log(log n)));
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sieve(n));
    }
}
