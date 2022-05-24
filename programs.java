

public class empwageuc4
{
    public static void main(String[] args) {
        int rateperhrs = 20;
        int fulltime = 1;
        int parttime = 2;
        int maxhrs=100;
        int emphr = 0;
        int totalemphrs=0;
        int noworkingdays = 20;
        int totalworkingdays = 0;
     int   empwage=0;
       while (totalemphrs <=maxhrs && totalworkingdays < noworkingdays)
       {
           totalworkingdays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empcheck) {
                case 1:
                    emphr = 4;
                    break;

                case 2:
                    emphr = 8;
                    break;

                default:
                    emphr = 0;
            }
           totalemphrs +=emphr;


            System.out.println( totalworkingdays + "emphrs"  + emphr );
        }
             empwage = (emphr * rateperhrs);
            System.out.println( "per day emp wage for" + emphr  + "is:" + empwage );
           int hrs=totalemphrs * rateperhrs;
        System.out.println( "total wage for"+ totalemphrs + "hrs is :" +    hrs);

    }
}







