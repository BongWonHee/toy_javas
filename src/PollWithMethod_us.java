import polls_us.PollinitailArray_us;
import polls_us.PollScanners_us;
import polls_us.PollStatistics_us;

public class PollWithMethod_us {

    public static void main(String[] args) {
        try {

            String[] answer;
            String[][] polls;

            // PollStatistics_us pollStatistics_us = new PollStatistics_us();
            PollinitailArray_us pollInitailArray = new PollinitailArray_us();
            polls = pollInitailArray.init(); // 설정초기화

         
            PollScanners_us pollScanners_us = new PollScanners_us();
            pollScanners_us.pollwhitAnswers(polls);
            PollStatistics_us pollStatistics_us = new PollStatistics_us();
            pollStatistics_us.printAnswers(answer);
        } catch (

        Exception e) {
            // TODO: handle exception
        }
    }
    // return 0;
}