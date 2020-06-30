package ryan.day1;

public class PracticePrintf {
    public static void main(String[] args) {
        double d = 3.1415926;
        double dd = 1.2 + 24 / 5;

        int i = 24 / 5;
        System.out.printf("%.2f\r\n", d);
        System.out.printf("%.2f\r\n", dd);
        System.out.println(i);

        String a = "hello";
        String b = "HELLO".toLowerCase();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String aa = "world";
        String bb = "world";
        System.out.println(aa == bb);
    }
}
