public class OperatorTest {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 25, d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));
    }
}
