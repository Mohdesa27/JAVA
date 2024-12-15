import java.util.*;

class Student {}
class Rockstar {}
class Hacker {}

public class InstanceOFTutorial {

    static String count(ArrayList<Object> mylist) {
        int studentCount = 0, rockstarCount = 0, hackerCount = 0;

        for (Object element : mylist) {
            if (element instanceof Student) {
                studentCount++;
            } else if (element instanceof Rockstar) {
                rockstarCount++;
            } else if (element instanceof Hacker) {
                hackerCount++;
            }
        }

        return studentCount + " " + rockstarCount + " " + hackerCount;
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of inputs
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) {
                mylist.add(new Student());
            } else if (s.equals("Rockstar")) {
                mylist.add(new Rockstar());
            } else if (s.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }
        sc.close();

        System.out.println(count(mylist));
    }
}
