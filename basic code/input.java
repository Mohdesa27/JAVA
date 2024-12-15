import java.util.Scanner; 
public class input {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int age;
        age=sc.nextInt();
        if(age<18)
        System.out.println("not eligible for vote");
        else
        System.out.println("u r adult");
        sc.close();
        }
}
