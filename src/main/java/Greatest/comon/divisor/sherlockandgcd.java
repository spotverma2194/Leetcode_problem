package Greatest.comon.divisor;
// Hacker rank problem sherlock and gcd
import java.util.*;
public class sherlockandgcd {
    static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public static String solve(List<Integer> a) {
        int gcd=a.get(0);
        for(int i=1;i<a.size();i++){
            gcd=gcd(a.get(i),gcd);
        }
        if(gcd==1) return "YES";
        return "NO";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(solve(list));

    }
}
