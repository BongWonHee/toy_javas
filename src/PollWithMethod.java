

import polls.PollInitailArray;
import polls.PollScanners;
import polls.PollStatistics;

public class PollWithMethod {
    public static void main(String[] args) {
        int x = 0;
        
        PollScanners scanners = new PollScanners();
        PollInitailArray array = new PollInitailArray();
        PollStatistics statistics = new PollStatistics();
        try {
            int z = scanners.scanners(x);
            array.Arrays(z);
           

        } catch (Exception e) {
            // TODO: handle exception
        } // return 0 ;
    }
}