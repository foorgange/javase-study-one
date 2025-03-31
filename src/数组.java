import java.util.Arrays;
import java.util.Scanner;

public class 数组 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 1; i <= 5; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("这是" + arr[i]);
        }

        //////////////////////////////////////////////////////////////

        int[] brr = {1, 2, 3, 4, 5}; // 初始化为指定值
        int[][] mir = new int[110][110];
        int[][] matri = {{1, 2}, {3, 4}, {5, 6}}; // 静态初始化
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("标记" + mir[i][j] + " ");
            }
            System.out.println();

        }

        /////////////////////////////////////////////////////////////////

        int len = arr.length;
       // int siz = arr.size();这是非法的！！！
        //数组排序
        Arrays.sort(arr);
        System.out.println("排序后的数组：" + Arrays.toString(arr));

        ///////////////////////////////////////////////////////////////////////

        //增强for循环
        for (int num : arr) {
            System.out.println(num);
        }




        scanner.close();
    }
}