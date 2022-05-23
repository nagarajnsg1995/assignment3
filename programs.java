import java.util.*;
public class cartesianuc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of first line");
        int a1 = sc.nextInt();
        System.out.print("Enter length of  second line");
        int b1 = sc.nextInt();
        if (a1 == b1)
            System.out.println("both lines are equal");
        else
            System.out.println("both lines are not equal");
    }
}

