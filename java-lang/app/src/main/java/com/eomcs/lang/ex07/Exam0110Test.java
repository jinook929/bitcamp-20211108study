package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Exam0110Test {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    int starLen = 1; //별 한개부터 시작
    while (starLen <= len) {
      // 별 앞에 공백 출력
      int spaceCnt = 1; //공백카운트 1부터시작
      int spaceLen = (len - starLen) / 2; //전체길이 - 현재 출력할 별개수 /2
      while (spaceCnt <= spaceLen) { 
        System.out.print(" ");
        spaceCnt++;
      }

      // 별 출력
      int starCnt = 1;
      while (starCnt <= starLen) {
        System.out.print("*");
        starCnt++;
      }

      // 출력 줄 바꾸기
      System.out.println();
      starLen += 2; //한줄 바뀔때마다 별 2개씩 추가 1, 3, 5 ...
    }
  }
}