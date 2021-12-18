//literal : 숫자를 표현하는 다양한 방법 - 진수법
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam2")
public class Exam2 {

  @GetMapping("/test1")
  public int test1() {
    //문자를 표현하는 다양한 방법
    // \ u 문자에 대해 부여된 코드 값(16진수)
    return 100; //10진수  (숫자를 표현할 때기본으로 많이 사용)
  }

  @GetMapping("/test2")
  public int test2() {
    //단일문자열
    return 0144; //8진수  
  }

  @GetMapping("/test3")
  public int test3(){return 0b0110_0100;} //2진수 binary의 약자 b

  @GetMapping("/test4")
  public int test4(){return 0x64;} //16진수(문자의 코드 값을 표현할 때 많이 사용) hexadecimal의 약자 x
}
