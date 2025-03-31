import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class aMain {
    // 类似 C++ 的全局变量区
    static final int MAX_N = 100010;
    static int[] arr = new int[MAX_N];

    public static void main(String[] args) throws Exception {
        // 输入输出加速（比 Scanner 快 5-10 倍）
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        // 算法代码区
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        for (int i = 0; i < n; i++) {
            pw.print(arr[i] + " ");
        }
        pw.println();


        // 输出结果
        pw.println("Result");
        pw.flush(); // 必须调用才能输出
    }
}