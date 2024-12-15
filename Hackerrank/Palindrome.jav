import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="";
       String s1=sc.nextLine();
       
       for(int i=s1.length()-1;i>=0;i--){
        // S=(String) S+;
        s=s+s1.charAt(i);
       }
       if(s1.equals(s)){
       System.out.println("Yes");
       }
       else
       System.out.println("No");
    }
    
}
