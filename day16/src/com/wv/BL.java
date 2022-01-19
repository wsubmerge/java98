package com.wv;

import java.util.Scanner;

/**
 * @Author Submerge
 * @Data 2021/10/13 16:32
 * 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 */
public class BL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scan.next();

        System.out.println("字符串遍历结果为：");

        for (int i = 0; i < s.length(); i++){
            char str = s.charAt(i);
            System.out.println(str);
        }
    }
}
