import java.util.*;
public class Int_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        if(str instanceof String){
            System.out.println("Good job");
        }else
        System.out.println("Wrong answer");
        sc.close();
    }
    
}
