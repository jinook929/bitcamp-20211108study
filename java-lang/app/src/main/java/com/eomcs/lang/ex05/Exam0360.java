// 논리 연산자 : 조건문과 비트 연산 
package com.eomcs.lang.ex05;

public class Exam0360 {
  public static void main(String[] args) {
    // &&, ||, ! 의 피연산자(operand)는 반드시 boolean 이어야 한다.
    // 그리고 계산 결과는 boolean이다.
    boolean r3,r4;
    r3 = 10 == 20; // 컴파일 오류!
    r4 = 10 > 20; // 컴파일 오류!
System.out.println(r3);
System.out.println(r4);
    // &, |, ^, ~(not) 의 피연산자는 정수이어야 한다.
    // 그리고 계산 결과도 정수이다.

    //r = 10 & 20; // 컴파일 오류! 비트 연산의 결과는 정수이다. 

    int r2 = 10 & 20; // OK!
    System.out.println(r2);
    //float r3 = 10.2f & 20.3f; // 컴파일 오류!
  }
}

