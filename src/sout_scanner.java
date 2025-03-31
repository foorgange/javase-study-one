import java.util.Scanner;

public class sout_scanner {
    public static void main(String[] args) {
        System.out.println("你好"+"hi");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
         long c = scanner.nextLong();
         scanner.close();
    }
}
