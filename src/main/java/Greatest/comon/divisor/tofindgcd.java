package Greatest.comon.divisor;

import java.util.Scanner;

public class tofindgcd {
    //Using brute force approach
    static int gcdbf(int x,int y){
        int a=Math.min(x, y);
        for(int i=a;i>=1;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return 0;
    }
    //Using long division approach
    static int gcdld(int x,int y){
        while(x%y!=0){
            int r=x%y;
            x=y;
            y=r;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number ");
        int n= sc.nextInt();
        System.out.println("enter the second number ");
        int m=sc.nextInt();
        System.out.println(gcdbf(n,m));
        System.out.println(gcdld(n,m));
    }
}
