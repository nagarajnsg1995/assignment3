public class empwageuc1 {
    public static void main(String[] args) {
        int ispresent=1;

        double empcheck = Math.floor( Math.random()*10) %2;
        if (empcheck == ispresent)
            System.out.println("emp is present");
        else
            System.out.println("emp is abscent");

        }
    }
