//literal : 문자 리터럴
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam5")
public class Exam5 {

  @GetMapping("/test1")
  public String test1() {
    return "문자1 : " +'A' + '가'; //문자리터럴은 양쪽 싱글 ''로 작성 , 문자열끼리 +를 하면 최종적으로
    // 합쳐져서 나온다. 문자열의 리턴값은 최종적으로 요청한 web browser test1에게 전달된다.
  }                 

  @GetMapping("/test2")
  public String test2() {
    return "문자2 : " +'\u0041' + '\uac00'; //문자에 대한 유니코드 값을 지정해도 된다.
  }                                       //대신 문자를 가리키는 코드임을 표시해야 한다. 

  @GetMapping("/test3")
  public String test3() {
    return "문자3 : " +(char)0x41 +"," +(char)0xac00; //문자 코드를 정수 값으로 지정한다.. 
    //대신 문자 코드임을 표시해야한다. char를 안붙이면 숫자로 나온다.
    //문자의 코드 값은 그냥 정수 값이다.
  }

  @GetMapping("/test4")
  public String test4() {
    return "문자4 : " +(char)65 +"," +(char)44032;  //문자의 코드 값은 그냥 정수 값이다. test3과 동일한 결과를 출력한다.
  }

  @GetMapping("/test5")
  public String test5() {
    return "문자5 :" + '\u4eba' +'\u00a9' + '\u03c0'+ '\u03a3' ;  // 키보드에서 입력 불가능한 특수 문자를 입력할 때 주로 유니코드를 사용한다.
  }                                                           // ex) 한자, 특수부호 등 人©πΣ
}
