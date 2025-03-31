record Point(int x, int y) {} // 定义一个记录

public class 类似结构体 {
    public static void main(String[] args) {
        Point p = new Point(10, 20); // 创建记录对象
        System.out.println("Point: (" + p.x() + ", " + p.y() + ")");
    }
}

/*
特点：
不可变性：

record 是不可变的（类似 C++ 的 const struct）。
成员变量默认 private final。
简洁性：

自动生成构造方法、toString、equals 和 hashCode 方法。
用途：

非常适合用来表示简单的数据容器，例如传递小对象。

 */