public class empwageuc3{
 public static void main(String[] args) {
        int fulltime=1;
        int parttime=0;
        int rateperhour=20;
        int emphrs=0;
        int mysalary=0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
       if (fulltime == empcheck)
            emphrs=8;
       else if ( parttime == empcheck)
             emphrs=4;
	mysalary=(rateperhour * emphrs);
       System.out.println(mysalary);
    }
}
