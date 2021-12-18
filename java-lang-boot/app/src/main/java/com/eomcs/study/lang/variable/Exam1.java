



package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable") //클래스 이름이 같을 때 충돌 방지, 스프링 부트가 ㅇ
@RequestMapping("/lang/variable/exam1")
public class Exam1 {
  //test URL 
  //http://localhost:8080/lang/variable/exam1/test1?name=eomjinyoung&tel=01082293336&gender=woman
  @GetMapping("/test1")
  public String test1(String name, String tel, String gender) {
   
    return "클라이언트에서 받은 값 = " +name + "," + tel + ","+ gender;
  }
  @GetMapping("/test2")
  //test URL -  정수 변수 선언과 값의 범위 : 정수값을 저장하는 변수 선언과 값의 범위 확인
  //http://localhost:8080/lang/variable/exam1/test2?b=100&s=32767&i=2100000000&l=9220000000000000000
  public String test2(byte b, short s, int i, long l) {
   
    return "클라이언트에서 받은 값 = " +b+ ","+ s + ","+ i + "," + l;
  }
  
  @GetMapping("/test3")
  //test URL : http://localhost:8080/lang/variable/exam1/test3?f=9865.43211&d=987643.1234567891
  //부동소수점 변수 선언과 값의 범위
  //부동소수점 값을 저장하는 메모리를 준비시키는 행동
  
  public String test3(float f, double d) {
   
    return "클라이언트에서 받은 값 = " + f + "," + d;
  }
  
  @GetMapping("/test4")
  //test URL : http://localhost:8080/lang/variable/exam1/test4?c=%EA%B0%80
  //문자에 부여된 번호를 저장할 메모리를 준비시키는 명령문
  //부동소수점 값을 저장하는 메모리를 준비시키는 행동
  
  public String test4(char c) {
   
    return "클라이언트에서 받은 값 = " + c+","+(int) c;  
    ////웹브라우저에서 한글을 입력받으면 %인코딩을 통해 test4?c=%EA%B0%80 이런식으로 변환되어 나온다.
    //앞에 int를 선언하면 입력받은 한글의 정수값을 출력해준다 클라이언트에서 받은 값 = 가,44032
  }
  //test URL : http://localhost:8080/lang/variable/exam1/test5?b=true false
  //주의 ! - boolean 리터럴은 true/false 이다.
  //논리 값으로 1/0, true/false 를 사용할 수 있는 이유는, Spring Boot가 중간에서 true/false 값으로 변환해주기 때문.
  @GetMapping("/test5")
 public String test5(boolean b) {
    return "클라이언트에서 받은 값 =" + b +",";  //(int) b; -> 이 경우는 문법적으로 형 변환이 불가능하다.
  }
  
}
  
 


