import java.util.Scanner;
public class pivotinteger {
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(approach1(n));


    }
}
