package ryan.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeArrayList {
    public static void main(String[] args) {
        int[] a = {20};

        // 此时打印 a[1] 将抛出异常，因为定义数组时只放了一个元素，那么 jvm 认为该数组 长度为1.
        // 数组一旦创建，大小不可变
        System.out.println(a[0]);

        eachArrayList();

        sortArrayListByBubble(getCommonIntArrayList());

        sortArrayListByBubbleV2(getCommonIntArrayList());
    }

    private static void eachArrayList(){
        System.out.println("start each arrayList...");
        int[] c = {1,2,3,4,5};
        System.out.printf("array is %s\r\n", Arrays.toString(c));
        for (int n : c){
            System.out.println(n);
        }
        System.out.println("end each arrayList...");
    }

    // 冒泡算法升序排序，每次冒泡出最小数的到数组前面
    private static void sortArrayListByBubble(int[] a){
        System.out.println("start each sortArrayListByBubble...");
        System.out.printf("array is %s\r\n", Arrays.toString(a));
        int loopTimes = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    loopTimes++;
                }
            }
        }
        System.out.printf("array by sorted is %s, loopTimes: %d\r\n", Arrays.toString(a), loopTimes);
        System.out.println("start each sortArrayListByBubble...");
    }

    // 冒泡算法排序, 每次冒泡出最大的数到数组末尾
    private static void sortArrayListByBubbleV2(int[] a){
        System.out.println("start each sortArrayListByBubble...");
        System.out.printf("array is %s\r\n", Arrays.toString(a));
        int loopTimes = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    loopTimes++;
                }
            }
        }
        System.out.printf("array by sorted is %s, loopTimes: %d\r\n", Arrays.toString(a), loopTimes);
        System.out.println("start each sortArrayListByBubble...");
    }

    // java 中数组为引用类型，数组排序后，变量指向的数组已经被排序，为了使用值一样的数组，每次实例一个数组对象，但数组中的元素均一样。
    private static int[] getCommonIntArrayList(){
        return new int[]{28, 12, 89, 73, 65, 18, 96, 50, 103, 8, 36, 9, 24, 0, 82, 101};
    }
}
