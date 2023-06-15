import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Statement;

public class PollsWithDB {
   public static void main(String[] args) {
      try {
         // - MySQL workbench 실행 : JDBC
         // - User/password와 접속 IP:port 접속
         // String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
         // String user = "root";
         // String password = "!yojulab*";

         // Connection connection = DriverManager.getConnection(url, user, password); //
         // network 자원사용
         // System.out.println("DB연결 성공\n");

         // // - query Edit
         // Statement statement = connection.createStatement(); // DB자원
         Scanner scanner = new Scanner(System.in);
         String mems = scanner.nextLine();

         while (!mems.equals("E")) {
            System.out.println("---- 선택을 입력 : " + mems);
            mems = scanner.nextLine();
            if (mems.equals("P")) {
               System.out.println("--- 설문 시작 ---");

            } else if (mems.equals("S")) {
               System.out.println("--- 설문 통계---");

            } else {

            }
         }
         System.out.println("--- 종 료 ---");

      } catch (Exception e) {
         // TODO: handle exception
      }
   }
}
