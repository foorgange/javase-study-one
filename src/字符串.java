import java.util.Scanner;

public class 字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strr = "hello,boy";
        String surr = "I love you";
        String result = strr + "__" + surr + "--";
        String cc = scanner.nextLine();
        System.out.println(result+" "+cc);

        //////////////////////////////

        int le = strr.length();//length 方法返回字符串的字符个数（包括空格和标点）。

        //System.out.println(strr[6]);是非法的，
        System.out.println(strr.charAt(6));//这样才是合法的

        String str = "Hello, Java!";
        String sub = str.substring(7, 11); // 截取索引7到索引11之间的字符，不包括索引11
        System.out.println("截取结果: " + sub);

        //查找字符串可以用indexOf()方法，indexOf()方法返回指定子字符串在此字符串中第一次出现处的索引。如果
        //找不到，就返回-1。
        int a = str.indexOf("Java");
        System.out.println("a"+a);

        //检测子字符串是否存在
        boolean aaa = str.contains("Java");
        System.out.println("是否包含 'Java': " + aaa);

        //替换字符串
        String replaced = str.replace("Java", "World");
        System.out.println(replaced);

        //转换大小写
        System.out.println(str.toUpperCase()); // 全大写
        System.out.println(str.toLowerCase()); // 全小写

        //去除字符串开头和结尾的空格，中间的空格不受影响。
        String trimmed = str.trim();
        System.out.println("去除空格后: " + trimmed);





    }
}
