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
        System.out.println(app1(arr,k));
    }
}
