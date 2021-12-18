package com.eomcs.lang.ex07;

// # 메서드 : 개념 및 기본 문법 II
//
public class Exam0221 {

  static void hello(int age,String name ) {
    System.out.printf(" %s님 %d살  반갑습니다.\n", name, age);
  }

  public static void main(String[] args) {
    // 파라미터의 타입, 개수, 순서가 일치해야 한다.

    //    hello("윤봉길"); // 컴파일 오류!
        hello( 20,"윤봉길");
    //    String r = hello("안중근", 30); // 컴파일 오류!
    //    void r = hello("안중근", 30); // 컴파일 오류!
  }
}
