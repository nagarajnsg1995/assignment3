public class empwageuc2{
    public static void main(String[] args) {
       int  ispresent=1;
       int rateperhour=20;
       int mysalary=0;
       int hours=8;
        double empcheck = Math.floor(Math.random() * 10) % 2;
       if (ispresent == empcheck)
     mysalary=(rateperhour * hours);
       System.out.println(mysalary);
    }
}
