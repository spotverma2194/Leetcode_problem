import java.util.Arrays;
import java.util.Scanner;

//leetcode 1074 number of submatric that sum equal to target
public class submatricequaltosum {
    static void print2darray(int[][] mat,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");

            }
            System.out.println();
        }
    }
    //Approach 1
    //brute force
    static int app1(int[][] mat,int r,int c,int target){
        int ans=0;
        for(int sr=0;sr<r;sr++){
            for(int sc=0;sc<c;sc++){
                for(int er=sr;er<r;er++){
                    for(int ec=sc;ec<c;ec++){
                        int sum=0;
                        for(int i=sr;i<=er;i++){
                            for(int j=sc;j<=ec;j++){
                                sum+=mat[i][j];
                            }

                        }
                        if(sum==target){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r=sc.nextInt();
        System.out.println("enter the number of columns");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the target");
        int k=sc.nextInt();
        System.out.println(app1(mat,r,c,k));
        print2darray(mat,r,c);
    }
}
