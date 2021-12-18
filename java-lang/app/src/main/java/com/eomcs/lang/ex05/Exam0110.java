package com.eomcs.lang.ex05;

//# 산술 연산자 : +, -, *, /, %
//
public class Exam0110 {
  public static void main(String[] args) {
    System.out.println(100 + 27);
    System.out.println(100 - 27);
    System.out.println(100 * 27);
    double dv = 100 /(double)27;
    System.out.println(dv);  //소수점까지 다 나오게 하고싶으면 어떻게하지?
    System.out.println(100 % 27); // 나눈 나머지 
  }
}