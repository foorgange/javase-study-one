package shi_yan;

import java.util.Scanner;
//实验一

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        int[] value = new int[100];
        count =sc.nextInt();
        for (int i = 0; i < count; i++) {
            value[i] = sc.nextInt();
            sum+= value[i];
        }
        double vv = 0;
        vv = sum/count;
        System.out.println("总和为"+sum);
        System.out.println("平均值为"+vv);
        System.out.print("数组中大于平均值的数有：");
        for (int i = 0; i < count; i++) {
            if(value[i]>vv){
                System.out.print(value[i]+" ");
            }
        }
        System.out.println();
        System.out.println("实验结束。");
    }
}
