package com.wv;

/**
 * @Author Submerge
 * @Data 2021/10/13 16:57
 */
public class PJ {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(method(arr));
    }
    public static String method(int[] arr){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++){
            if (i != arr.length-1){
                str.append(arr[i]).append(",");
            }else {
                str.append(arr[i]);
            }
        }
        str.append("]");
        return str.toString();
    }
}
