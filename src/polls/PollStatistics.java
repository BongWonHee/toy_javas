package polls;

public class PollStatistics {
    public String print(int x) {
        String answer = "";
          // 스캔으로 입력한 값 1~4 까지 제한된 값으로 결과를 출력한다.
        try {
            if (x == 1 ) {
                answer = "(1)전혀아니다.";
            }else if ( x == 2 ){
                answer = "(2)아니다.";
            }else if ( x == 3 ){
                answer = "(3)그렇다.";
            }else if ( x == 4){
                answer = "(4)매우 그렇다.";
            }

        } catch (

        Exception e) {
            // TODO: handle exception
        }
        return answer;

    }
}
