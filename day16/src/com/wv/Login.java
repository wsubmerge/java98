package com.wv;

import java.util.Scanner;

/**
 * @Author Submerge
 * @Data 2021/10/13 10:42
 */
public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "submerge";
        String pwd = "123456";

        for (int i = 0; i < 3 ; i++){

            System.out.println("请输入用户名；");
            String name1 = scan.nextLine();
            System.out.println("请输入密码：");
            String passWord1 = scan.nextLine();

            if (name.equals(name1) && pwd.equals(passWord1)){
                System.out.println("登录成功！");
                break;
            }else {
                System.out.println("登录失败！");
            }

        }

    }
}
