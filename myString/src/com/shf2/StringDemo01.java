package com.shf2;

public class StringDemo01 {
    public static void main(String[] args) {
        char[] chs={'a','b','c'};
        String s1=new String(chs);
        String s2=new String(chs);
        System.out.println(s1==s2);

        String s3="abc";
        String s4="abc";
        System.out.println(s3==s4);
        System.out.println(s1==s4);
    }
}
