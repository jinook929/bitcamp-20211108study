package com.eomcs.lang.ex06;

//# 흐름 제어문 - do ~ while 반복문
//
public class Exam0340 {
  public static void main(String[] args) {
    int i = 0;

    // 1부터 10까지 출력하기
    do
      System.out.println(++i);
    while (i < 10);  //do while 문은 조건이 거짓이라도 일단 실행한다
                      //그리고 나서 조건의 참,거짓에 따라 반복 또는 중단한다.

    System.out.println("---------------------");

    // 여러 개의 문장을 반복할 때는 블록으로 묶어라!
    i = 0;
    do {
      i += 1;
      System.out.println(i);
    } while (i < 10);
  }
}

/*
# do ~ while
- 최소 한 번은 반복한다.
- 한 번 이상 반복하면 do ~ while
- 0 번 이상 반복하면 while

  do
    문장1;
  while (조건);

  do {
    문장1;
    문장2;
    문장3;
  } while (조건);
 */
