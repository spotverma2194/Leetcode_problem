package Greatest.comon.divisor;

import java.util.Scanner;

//2447... Number of Subarrays With GCD Equal to K
public class leetcode2447 {
    //function to find gcd
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    //function to find subarray og gcd k
    static int subarrayGCD(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int gcd=nums[i];
            if(gcd==k){
                ans++;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<k) break;
                gcd=gcd(gcd,nums[j]);
                if(gcd==k) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the k");
        int k=sc.nextInt();
        System.out.println(subarrayGCD(arr,k));
    }
}
