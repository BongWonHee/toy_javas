

import polls.PollInitailArray;
import polls.PollScanners;
import polls.PollStatistics;
//  PollInitailArray로 문제와 질문지를 출력후 입력값을 스캔을 받아서 PollStatistics로 넘겨 준 후 해당 값 출력 한다.
public class PollWithMethod {
    public static void main(String[] args) {
        int x = 0;
        
        // PollScanners scanners = new PollScanners();
        PollInitailArray array = new PollInitailArray();
        // PollStatistics statistics = new PollStatistics();
        try {
            
            
            // int z = scanners.scanners(x); //입력값은 1~4 까지로 제안한다. 
            array.Arrays(x);// 스캐너에서 받은 값을 Array로 넘겨줌.
           

        } catch (Exception e) {
            // TODO: handle exception
        } // return 0 ;
    }
}