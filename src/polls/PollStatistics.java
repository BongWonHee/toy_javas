package polls;

// import polls.PollScanners;

public class PollStatistics {
    public String print(int x) {
        String answer = "";
        // PollinitailArray 에서 입력 받은 값을 출력 한다.

        try {
            if (x == 1) {
                answer = "(1)전혀아니다.";
            } else if (x == 2) {
                answer = "(2)아니다.";
            } else if (x == 3) {
                answer = "(3)그렇다.";
            } else if (x == 4) {
                answer = "(4)매우 그렇다.";
            } else {
                System.out.println("없는 답항입니다.");
            }

            // PollScanners scanners = new PollScanners();
            // scanners.scanners(x);
            

        } catch (

        Exception e) {
            // TODO: handle exception
        }

        return answer;

    }
}
