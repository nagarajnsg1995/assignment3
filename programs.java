import java.util.*;
public class CompareLine {
    public static final int x1=1,x2=1,y1=1,y2=1;
    public static final int a1=2,a2=1,b1=8,b2=1;

    public static void main(String[] args) {

        double line1=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)*1);
        double line2=Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2)*1);

        System.out.println("length of line1 is"+line1);
        System.out.println("length of line2 is"+line2);

        if (line1>line2){
            System.out.println("line1 is greater then line2");
        }
       else if (line2>line1){
            System.out.println("line2 is greater then line1");
        }
       else
            System.out.println("both lines are equal");

    }
}
