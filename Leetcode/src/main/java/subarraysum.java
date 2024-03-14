import java.util.HashMap;
import java.util.Scanner;
//Leetcode problem 560 subarray sum equals k
public class subarraysum {
    //Approach 1
    //brute force
    //t.l.e.
    static int app1(int[] a,int t){
     int ans=0;
     int n=a.length;
     for(int s=0;s<=n-1;s++){
         for(int e=s;e<=n-1;e++){
             int sum=0;
             for(int i=s;i<=e;i++){
                 sum+=a[i];
             }
             if(sum==t) ans++;
         }
     }
     return ans;
    }
    //Approach 2
    //Optimal solution
    //t.c O(n)
    static int app2(int[] nums,int k){
        int ans=0;
        int sum=0;
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            System.out.println(i+" element");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int k=sc.nextInt();
        //System.out.println(app1(arr,k));
        System.out.println(app2(arr,k));
    }
}
