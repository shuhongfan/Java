package com.shf;

public class MyThread extends Thread{
  public MyThread(){}

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(getName()+":"+i);
    }
  }
}
