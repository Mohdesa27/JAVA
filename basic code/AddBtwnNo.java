import java.util.Scanner;

public class AddBtwnNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int n,m;
     n=sc.nextInt();
     m=sc.nextInt();
     int sum=0;
     for(int i=n+1;i<m;i++)
     {
        sum=sum+i;
    }
    System.out.println(sum);
    sc.close();
}
}
