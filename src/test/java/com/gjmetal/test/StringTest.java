package com.gjmetal.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: StringTest
 * @Description: TODO
 * @author: cwq
 * @date: 2020/4/3 22:10
 */
@Slf4j
public class StringTest {
    public static void main(String[] args) throws InterruptedException {

//        ArrayList

//        setClassiFication();

//        System.out.println(getEvenSum(1, 10));

//        splitStrig("我ABC", 4);
//        splitStrig("我ABC汉DEF", 6);

//        testStackOverFlowError();
//        testOutOfMemoryError();

//        int[] intArr = new int[]{3, 4, 5, 6, 7, 8};

//        System.out.println(str(intArr));

//        int[] intArr = new int[]{12, 8, 44, 22, 66, 99, 67, 32, 199};
//        System.out.println(getMaxOrMin(intArr));


//        int[] intArr = new int[]{12, 8, 44, 22, 66, 99, 67, 32, 199};
//        selectionSort(intArr);
//        bubbleSort(intArr);
//        System.out.println(serachKey(intArr, 66));
//        System.out.println(binarySearch(intArr, 99));
//        reverse(intArr);
//        System.out.println(arrayToString(intArr));

//        String[] countries = {"China", "America", "Canada", "Korea", "England"};
//        printArray(countries);
//        sortString(countries);
//        printArray(countries);

//        String str = "cwqnlksllkslkcwqcccndfgnslnlcqwcwqssmgslmlmcwqnsdnfgsnnsnkfccwq";
//        String key = "cwq"
//        System.out.println(getKeyCount(str, key));

//        String ilu = "ILOVEYOU";
//        printStringByLeng(ilu);


//        String s1 = "nngsogbslbsslkcwqldffkotbkxg";
//        String s2 = "bcnxbhgrcwqironbddj";
//        System.out.println(getMaxSubstring(s1, s2));

//        reverseStr();
//        sleep(TimeUnit.MINUTES, 2);
//
//        sleep(24 * 60 * 1000);
//        TimeUnit.HOURS.sleep(1);sleep1
//        sleep1(6000);

//        sleep1(TimeUnit.SECONDS, 6);
//        StringBuffer s = new StringBuffer("123");
//        System.out.println(Integer.valueOf(s.reverse().toString()));
//        StringBuffer s1 = new StringBuffer("-123");
//        s1.replace(0, 1, "");
//        System.out.println("-" + Integer.valueOf(s1.reverse().toString()));
//        String str = "120";
//        char[] chars = str.toCharArray();
//        StringBuffer ss = new StringBuffer(str.replace("0", ""));
//        System.out.println(ss.reverse());

        //
    }

//    public List<Interval> merge(List<Interval> intervals) {
//        List<Interval> intervals1 = new ArrayList<>();
//        if (intervals.size() == 0) {
//            return intervals;
//        }
//        for (int i = 0; i < intervals.size(); i++) {
//            for (int j = i + 1; j < intervals.size(); j++) {
////                if (intervals.get(i).start > intervals.get(j).start) {
//                if (intervals.get(i).start > intervals.get(j).end) {
//                    Interval tem = intervals.get(i);
//                    intervals.set(i, intervals.get(j));
//                    intervals.set(j, tem);
//                }
//            }
//        }
//        int min = intervals.get(0).s;
//        int max = intervals.get(0).end;
//        for (int i = 1; i < intervals.size(); i++) {
//            //重叠即合并区间
//            if (intervals.get(i).start <= max) {
//                max = intervals.get(i).end > max ? intervals.get(i).end : max;
//            } else {
//                intervals1.add(new Interval(min, max));
//                min = intervals.get(i).start;
//                max = intervals.get(i).end;
//            }
//        }
//        intervals1.add(new Interval(min, max));
//        return intervals1;
//    }


    public static void sleep1(long l) throws InterruptedException {

        long l1 = System.currentTimeMillis();

        while (l > 0) {
            long l2 = System.currentTimeMillis();

            l -= l2 - l1;


            l1 = l2;

        }

    }


    public static void sleep1(TimeUnit unit, long l) throws InterruptedException {
        l = unit.toMillis(l);
        long l1 = System.currentTimeMillis();

        while (l > 0) {
            long l2 = System.currentTimeMillis();

            l -= l2 - l1;


            l1 = l2;

        }

    }

    public static void sleep(TimeUnit unit, int n) throws InterruptedException {
        long l = unit.toMillis(n);
        Thread.sleep(l);
    }

    public static void sleep(long l) throws InterruptedException {
//        long l = unit.toMillis(n);
        Thread.sleep(l);
        ArrayList<String> ls = new ArrayList<>();
    }

    private static void reverseStr() {
        StringBuffer sb = new StringBuffer("cwq");
        System.out.println(sb.reverse().toString());
    }

    /**
     * @description: //获取两个字符串的最大相同字串
     * @author: cwq
     * @date: 2020/4/4 23:54
     * @param:
     * @return:
     **/
    private static String getMaxSubstring(String s1, String s2) {
        String max, min;
        max = s1.length() > s2.length() ? s1 : s2;
        min = max.equals(s1) ? s2 : s1;
        for (int i = 0; i < min.length(); i++) {
            for (int start = 0, end = min.length() - i; end <= min.length(); start++, end++) {
                String temp = min.substring(start, end);
                if (max.contains(temp)) {
                    return temp;
                }
            }
        }
        return null;
    }

    /**
     * @description: //按长度递减字符串
     * @author: cwq
     * @date: 2020/4/4 23:02
     * @param:
     * @return:
     **/
    private static void printStringByLeng(String ilu) {
        for (int i = 0; i < ilu.length(); i++) {
            for (int start = 0, end = ilu.length() - i; end <= ilu.length(); start++, end++) {
//                System.out.println(start + "" + end + "\t");
                System.out.print(ilu.substring(start, end) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * @description: //统计字符串出现的次数
     * @author: cwq
     * @date: 2020/4/4 22:51
     * @param:
     * @return:
     **/
    private static int getKeyCount(String str, String key) {


        int index = 0;
        int count = 0;
        while ((index = str.indexOf(key, index)) != -1) {
            index = index + key.length();
            count++;
        }
        return count;
    }

    /**
     * @description: //字符串排序
     * @author: cwq
     * @date: 2020/4/4 22:45
     * @param:
     * @return:
     **/
    private static void sortString(String[] countries) {
        for (int i = 0;
             i < countries.length - 1; i++) {
            for (int j = 0; j < countries.length - 1; j++) {
                if (countries[j].compareTo(countries[j + 1]) > 0) {
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
    }

    private static void printArray(String[] countries) {
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i] + "");
        }
        System.out.println();
    }

    private static void reverse(int[] intArr) {
        for (int start = 0, end = intArr.length - 1; start < end; start++, end--) {
            intArr[start] = intArr[start] ^ intArr[end];
            intArr[end] = intArr[start] ^ intArr[end];
            intArr[start] = intArr[start] ^ intArr[end];
        }
    }

    /**
     * @description: //折半查找
     * @author: cwq
     * @date: 2020/4/4 19:55
     * @param:
     * @return:
     **/
    private static int binarySearch(int[] intArr, int num) {
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        int min = 0;
        int max = intArr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (intArr[mid] > num) {
                max = mid - 1;
            } else if (intArr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    /**
     * @description: //无序查找
     * @author: cwq
     * @date: 2020/4/4 19:56
     * @param:
     * @return:
     **/
    private static int serachKey(int[] intArr, int num) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @description: //冒泡排序
     * @author: cwq
     * @date: 2020/4/4 18:14
     * @param:
     * @return:
     **/
    private static void bubbleSort(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {
                if (intArr[j] < intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
    }


    /**
     * @description: //选择排序
     * @author: cwq
     * @date: 2020/4/4 18:12
     * @param:
     * @return:
     **/
    private static void selectionSort(int[] intArr) {

        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    intArr[i] = intArr[i] ^ intArr[j];
                    intArr[j] = intArr[i] ^ intArr[j];
                    intArr[i] = intArr[i] ^ intArr[j];
                }
            }
        }
    }

    private static String arrayToString(int[] intArr) {

        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < intArr.length - 1; i++) {
            sb.append(intArr[i]).append(",");
        }
        sb.append(intArr[intArr.length - 1]).append("]");
        return sb.toString();
    }

    private static String arrayToString1(int[] intArr) {

        String temp = "[";
        for (int i = 0; i < intArr.length; i++) {
            if (i == intArr.length - 1) {
                temp = temp + intArr[i] + "]";
            } else {
                temp = temp + intArr[i] + ",";
            }
        }
        return temp;
    }

    private static String findTableMthod(int i) {
        if (i < 1 || i > 8) {
            return i + "不存在。";
        }

        String[] weeks = {"", "1", "2", "3", "4", "5", "6", "7"};

        return weeks[i];
    }

    private static String getMaxOrMin(int[] intArr) {
        int max = intArr[0];
        int min = intArr[0];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            }
            if (min > intArr[i])
                min = intArr[i];
        }
        return sb.append(min).append("=").append(max).toString();
    }

    private static String str(int[] intArr) {
//        String s = Arrays.toString(intArr);
//        return s.substring(1, s.length() - 1);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < intArr.length; i++) {
            sb.append(intArr[i]).append(",");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1).toString() : "";
    }

    /**
     * @description: //抛出OutOfMemoryError
     * @author: cwq
     * @date: 2020/4/4 17:06
     * @param:
     * @return:
     **/
    private static void testOutOfMemoryError() {
        ArrayList<int[]> list = new ArrayList<>();

        while (true) {
            int[] i = new int[666666666];
            list.add(i);
        }
    }

    /**
     * @description: //抛出stackOverFlowError
     * @author: cwq
     * @date: 2020/4/4 17:01
     * @param:
     * @return:
     **/
    private static void testStackOverFlowError() {
        while (true) {
            testStackOverFlowError();//递归
        }
    }

    /**
     * @description: //编写一个截取字符串的函数，
     * 输入为一个字符串和字节数，输出为按字节截取的字符串。
     * 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，应该输出为“我ABC”而不是“我ABC+汉的半个”。
     * @author: cwq
     * @date: 2020/4/4 16:44
     * @param:
     * @return:
     **/
    private static void splitStrig(String str, int len) {

        if (StringUtils.isEmpty(str)) {
            log.debug("Str is null");
            return;
        }
        String subStr;
        int byteNum = 0;
        byte[] bt = str.getBytes();
        byteNum = str.length();

        if (len > byteNum) {
            len = byteNum;
        }
        if (bt[len] < 0) {
            subStr = new String(bt, 0, --len);
            System.out.println(subStr);
        } else {
            subStr = new String(bt, 0, len);
            System.out.println(subStr);
        }
    }


    /**
     * @description: //TODO
     * @author: cwq
     * @date: 2020/4/3 22:21
     * @param:
     * @return:
     **/
    private static int getEvenSum(int num1, int num2) {
        int num = num1 + 1;
//        int sum = 0;
//        while (num < num2) {
//            if (num % 2 == 0) {
//                sum += num;
//            }
//            num++;
//        }
//        return sum;
        int sum = 0;
        for (int i = num1; i < num2; i++) {

            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }


    /**
     * @description: //   //1到100的循环，把奇数放在一个int[50]，把偶数存放到一个hashmap，map的key从7开始
     * @author: cwq
     * @date: 2020/4/4 16:48
     * @param:
     * @return:
     **/
    private static void setClassiFication() {
        int[] numbers = new int[50];
        Map<Integer, Integer> map = new HashMap<>();
        int hashKey = 7;
        for (int i = 1, j = (numbers[i] == 0 ? 1 : numbers[i]); i < 50 && j < 101; j++) {
            if (j % 2 == 1) {
                numbers[i] = j;
                i++;
//                System.out.println("奇数： " + j);
            } else {
                map.put(hashKey, j);
                hashKey++;
//                System.out.println("偶数：" + j);
            }
        }
//        map.forEach((k, v) -> {
//            System.out.println(k + "==" + v);
//        });
    }
}