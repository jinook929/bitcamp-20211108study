//literal : 문자열 리터럴과 이스케이프 캐릭터
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam6")
public class Exam6 {

  @GetMapping("/test1")
  public String test1() {
    return "012ABC가각간똘똠똡똥";
  }

  @GetMapping("/test2")
  public String test2() {
    //제어 코드
    // \n : Line Feed
    // \r : Carriage Return
    // \f - Form Feed, 0x0c
    // \t - Tab, 0x09
    // \b - Backspace, 0x08
    // \' - Single Quote, 0x27
    // \" - Double Quote, 0x22
    // \\ - Backslash, 0x5c
    return "012\nABC\n가각간\n똘똠똡똥";
  }

  @GetMapping("/test3")
  public String test3() {
    //제어 코드
    // \n : Line Feed
    // \r : Carriage Return - \r은 콘솔창에서 봐야 제대로된 의미를 파악할 수 있다. 
    // (브라우저쪽에선 아무런 의미를 갖지 못하기 때문이다)                                                             
    return "012\rABC\r가각간\r똘똠똡똥";
  }

  @GetMapping("/test4")
  public String test4() {
    //제어 코드
    // \t - Tab, 0x09
    return "012\tABC\t가각간\t똘똠똡똥";
  }

  @GetMapping("/test5")
  public String test5() {
    //제어 코드
    // \b - Backspace, 0x08 웹브라우저에서 소용 없다
    return "012\bABC\b가각간\b똘똠똡똥"; 
  }

  @GetMapping("/test6")
  public String test6() {
    //제어 코드
    // \\ - Backslash, 0x5c
    return "012\\tABC\\t가각간\\t똘똠똡똥";
  }
}
