package polls;
import java.util.Scanner;
import polls.PollScanners;
import polls.PollStatistics;

public class PollInitailArray {

    public String[][] Arrays(int x) {
        PollScanners scanner = new PollScanners();
        // PollStatistics statistics = new PollStatistics();
        Scanner myOjt = new Scanner(System.in); 
        System.out.println("이름이 입력하세요");
        String name = myOjt.nextLine();
        System.out.println("이름은 : " + name);
        
        String[][] Que = { { "1.교수는 수업 전 강의 목표를 명확히 제시하였습니까?",

                "2.강의의 내용은 체계적이고 성의있게 구성되었는가?",

                "3.교수는 강의 내용에 대해 전문적 지식이 있었는가?",

                "4.강의 진행 속도는 적절하였는가?"

                }, { "(1)전혀 아니다  (2)아니다.  (3)그렇다.  (4)매우그렇다." }
        };
        // String answer = ("(1)전혀아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
        try {

            for (int i = 0; i < Que[0].length; i++) {

                System.out.println(Que[0][i]); // 해당 질문을 프린트 한다.
                // System.out.println(answer);
                System.out.println(Que[1][0]);
                int print = scanner.scanners(x);// scanners 에 값을 받는다.
                // statistics.print(print);// scanners에서 받은 값을 PollStatistics 로 넘겨준다.
                // scanner에서 받은 값을 가지고 Scanners에서 PollStatistics로 값을 던져준다. 
                

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        // System.out.println(" --- 설문 종료 ---");
        
       
       
        return Que;
    }

}