
import java.util.Scanner;


public class Main {

   /* public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Compf c = new Compf();
        while (true) {
            System.out.println("Введите формулу -> ");
            c.compile(scan.nextLine().toCharArray());
        }
    }
    */

   public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       Calc c = new Calc();
       while (true) {
           System.out.println("Введите формулу -> ");
           c.compile(scan.nextLine().toCharArray());
       }
   }
}