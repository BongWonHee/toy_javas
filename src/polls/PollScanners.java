
package polls;
import polls.PollInitailArray;
import polls.PollStatistics;
import java.util.Scanner;

public class PollScanners {
    public int scanners(int y) {
        int x = 0 ;
        
        try {
            Scanner my = new Scanner(System.in);
            
             y = my.nextInt();
            x = y;

            // PollInitailArray Array = new PollInitailArray();
            // Array.Arrays(x);
           PollStatistics statistics = new PollStatistics();
           statistics.print(x);
           
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        return x;
    }
}
// int reply = 0;

// public PollScanners() {
// } // PollScanners 초기화

// // public PollScanners(int anw) {
// // Scanner myOjt = new Scanner(System.in);
// // anw = myOjt.nextInt();
// // this.reply = anw;
// // System.out.println("답 :" + anw);
// // }
// public int Getreply(int anw) {
// Scanner myOjt = new Scanner(System.in);
// anw = myOjt.nextInt();
// this.reply = anw;
// return this.reply;
// }
// }
// Scanner myOjt//name =myOjt
// String [] answer
// 정답입력->넘어간다, string[]answer 넣어줌.
