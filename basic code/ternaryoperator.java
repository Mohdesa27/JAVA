import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        String x;
        n=sc.nextInt();
        x=(n%2==0)?"even":"odd";
        System.out.println(x);
        sc.close();
    }
}
