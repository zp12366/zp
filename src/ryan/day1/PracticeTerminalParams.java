package ryan.day1;

public class PracticeTerminalParams {
    public static void main(String[] args) {
        for (String arg : args){
            if ("-v".equals(arg)){  // 字符串为引用类型，必须使用 equals 比较大小，不能使用 = 判断
                System.out.println("v 0.0.1");
                break;
            }
        }
    }
}
