import java.util.Scanner;

public class Ex01 {
      public static void main(String[] args) {
            int A, B, PROD;
            Scanner scanner = new Scanner(System.in);

            A = scanner.nextInt();
            B = scanner.nextInt();
            PROD = A * B;
            
            scanner.close();
            
            System.out.println("PROD = " + PROD);
      }
}
