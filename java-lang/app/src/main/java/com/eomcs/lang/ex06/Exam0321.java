package com.eomcs.lang.ex06;

//# 흐름 제어문 - break와 continue 활용
//
public class Exam0321 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;


    // 1부터 100까지의 짝수의 합은?
    // => continue 사용 전
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if ((count & 1) == 0) { // count & 1 ==> count & 0x01 ==> count % 2
        sum += count; // 짝수, 홀수를 구별할 때 비트 연산자 &을 이용해 맨 끝
                    //에 있는 비트가 0인지1인지를 판별한다. 0이면 짝수, 1이면 
                    // 홀수. 16 8 4 2 1 -> 이런식으로 비트는 증가하기 때문에
                    // 1을 제외한 나머지는 모두 짝수이다, 그래서 맨끝 비트로만
                    // 판단한다.
      }
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);

    System.out.println("------------------------");

    // => continue 사용 후
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 1)
        continue; // 다음 문장을 실행하지 않고 즉시 조건 검사로 이동한다.
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }
}
