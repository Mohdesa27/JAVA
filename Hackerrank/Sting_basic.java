import java.util.Scanner;
public class Sting_basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int n=s.length();
        int m=s1.length();
        System.out.println(n+m);
        if(s.compareTo(s1)>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }
        String s2=(((s.charAt(0)+"").toUpperCase())+s.substring(1)+" "+(s1.charAt(0)+"").toUpperCase()+s1.substring(1));
        System.out.println(s2);
    }
    
}
