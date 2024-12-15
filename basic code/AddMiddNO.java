import java.util.Scanner;
public class AddMiddNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        n=n/10;
        while (n>10) {
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println(s);
    }
    
}
