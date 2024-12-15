import java.util.Scanner;

public class Ifelse {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int math,phy,chem,per;
        math=sc.nextInt();
        phy=sc.nextInt();
        chem=sc.nextInt();
        per=((math+chem+phy)*100)/300;
        System.out.println(per);
        if(per>90)
        System.out.println("u r in top 10 and topper");
        else if (per<=90 && per>=75 )
        System.out.println("1 division");
        else if (per<75 && per>=50 )
        System.out.println("2 divison");
        else if(per>=33 && per<50)
        System.out.println("pass");
        else
        System.out.println("failed");
        sc.close();
    }
}
