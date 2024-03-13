import java.util.Scanner;
public class pivotinteger {
    //Approach 1
    //linear search
    //t.c. O(n^2)
    static int approach1(int n){
        for(int pivot=1;pivot<=n;pivot++){
            int leftsum=0;
            int rigthsum=0;
            for(int j=1;j<=pivot;j++){
                leftsum+=j;
            }
            for(int k=pivot;k<=n;k++){
                rigthsum+=k;
            }
            if(leftsum==rigthsum){
                return pivot;
            }
        }
        return -1;
    }
    //Approach 2
    //improving approach 1
    //t.c. O(n)
    static int approach2(int n){
        for(int pivot=1;pivot<=n;pivot++){
            int leftsum=(pivot*(pivot+1))/2;
            int tsum=(n*(n+1))/2;
            int rightsum=tsum-leftsum+pivot;
            if(leftsum==rightsum){
                return pivot;
            }
        }
        return -1;
    }
    //Approach 3
    //two pointer
    //t.c. O(n)
    static int approach3(int n){
        int i=1;
        int j=n;
        int leftsum=1;
        int rightsum=n;
        while(i<j){
            if(leftsum<rightsum){
                i++;
                leftsum+=i;
            }
            else{
                j--;
                rightsum+=j;
            }
        }
        if(leftsum==rightsum){
            return i;
        }
        else{
            return -1;
        }
    }
    //Approach 4
    //math
    //t.c. O(1)
    static int approach4(int n){
        int tsum=(n*(n+1))/2;
        int pivot=(int)Math.sqrt(tsum);
        if(Math.pow(pivot,2)==tsum){
            return pivot;
        }
        return -1;
    }
    //Approach 5
    //binary search
    //t.c. O(log n)
    static int approach5(int n){
        int tsum=(n*(n+1))/2;
        int left=1;
        int right=n;
        while(left<right){
            int midpivot=(left+(right-1))/2;
            if(Math.pow(midpivot,2)==tsum){
                return midpivot;
            }
            else if(Math.pow(midpivot,2)<tsum){
                left++;
            }
            else if(Math.pow(midpivot,2)>tsum){
                right--;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(approach1(n));
        System.out.println(approach2(n));
        System.out.println(approach3(n));
        System.out.println(approach4(n));
        System.out.println(approach5(n));
    }
}
