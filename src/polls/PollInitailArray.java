package polls;

import polls.PollScanners;
import polls.PollStatistics;

public class PollInitailArray {

    public String[] Arrays(int x) {
        PollScanners scanner = new PollScanners();
        PollStatistics statistics = new PollStatistics();
        String[] Que = {
                "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
                "2.강의의 내용은 체계적이고 성의있게 구성되었는가?",
                "3.교수는 강의 내용에 대해 전문적 지식이 있었는가?",
                "4.강의 진행 속도는 적절하였는가?" };

        try {

            for (int i = 0; i < Que.length; i++) {
                
                System.out.println(Que[i]); //해당 질문을 프린트 후에
                int print = scanner.scanners(x);//  scanners 에 값을 받는다.
                statistics.print(print);// scanners에서 받은 값을 PollStatistics 로 넘겨준다.

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return Que;
    }

}