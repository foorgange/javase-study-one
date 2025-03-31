public class addd {

    public  int add ( int a, int b){
        return a + b;
    }
    //public其它类也能访问，但private类内只能访问
    //类似C++中的函数
    public static void main(String[] args) {

        addd main = new addd(); // 创建 addd 类的对象
        int result = main.add(10, 20); // 通过对象调用 add 方法
        System.out.println("Result: " + result); // 输出：Result: 30

    }
}
