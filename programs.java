import java.util.*;
public class cartesianuc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of first l1");
        int l1 = sc.nextInt();
        System.out.print("Enter length of second l2");
        int l2 = sc.nextInt();

        if (l1 > l2) {
            System.out.print( " l1 is greater then l2");
        }
        else if (l1 < l2){
            System.out.print( " l2 is lesser then l2");
        }
        else
            System.out.print( "both lines are equal");
    }
}
