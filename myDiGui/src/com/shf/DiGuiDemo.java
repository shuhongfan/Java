package com.shf;

public class DiGuiDemo {
  public static void main(String[] args) {
    int[] arr=new int[20];

    arr[0]=1;
    arr[1]=1;

    for(int i=2;i<arr.length;i++)
      arr[i]=arr[i-1]+arr[i-2];
    System.out.println(arr[19]);

    System.out.println(f(19));
  }
  public static int f(int n){
    if(n==0||n==1) return 1;
    else return f(n-1)+f(n-2);
  }
}