package com.wv;

import java.util.Scanner;

/**
 * @Author Submerge
 * @Data 2021/10/13 16:44
 */
public class Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scan.next();

        int large = 0, small = 0, num = 0; int error = 0;
        for (int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                large++;
            }else if (c >= 'a' && c <= 'z'){
                small++;
            }else if (c >= '0' && c <= '9'){
                num++;
            }else {
                error++;
                System.out.println("出现第"+ i +"其他字符！");
            }
        }

        System.out.println("大写字母个数为:" + large + " 小写字母个数为:" + small + " 数字个数为:" + num + " 其他字符" + error);
    }
}
