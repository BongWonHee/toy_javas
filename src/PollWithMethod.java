import polls.PollInitailArray;
import polls.PollScanners;
import polls.PollStatistics;
import java.util.Scanner;

public class PollWithMethod {
    public static void main(String[] args) {
        int x = 0;
        String y = "";
        PollScanners scanners = new PollScanners();
        PollInitailArray array = new PollInitailArray();
        try{
            array.Arrays();
            scanners.Getreply();
          
          
          
            x = array.Arrays(y);
            PollStatistics printing = new PollStatistics();
            String answer = printing.print(x);
            System.out.println(answer);
        
     


        } catch 
        (Exception e) {
            // TODO: handle exception
        } // return 0 ;
    }
}