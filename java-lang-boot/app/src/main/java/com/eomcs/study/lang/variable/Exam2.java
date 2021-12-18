package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable.exam2") //클래스 이름이 같을 때 충돌 방지. 스프링부트가 Exam2를 관리할 때 쓰는 이름
@RequestMapping("/lang/variable/exam2") //웹브라우저가 Exam2를 실행시킬 때 메서드를 호출하는 경로명
public class Exam2 {
  @GetMapping("/test1")
  //여러 개의 값을 받는 방법
  //test URL : http://localhost:8080/lang/variable/exam2/test1?name1=홍길동name2=임꺽정&name3=유관순&name4=%EC%9E%84%EA%BA%BD%EC%A0%95&name5=%EC%9C%A4%EB%B4%89%EA%B8%B8&name6=%EA%B9%80%EA%B5%AC&name7=%ED%99%8D%EB%B2%94%EB%8F%84
  public String test1(String name1, String name2, String name3, String name4, String name5, String name6, String name7) {
    return "=>  " +name1 + "," + name2 + ","+ name3 + ","+ name4 + ","+ name5 + ","+ name6 + ","+ name7;
  }

  @GetMapping("/test2")
  //test URL : http://localhost:8080/lang/variable/exam2/test2?name=홍길동name=임꺽정&name=유관순&name=%EC%9E%84%EA%BA%BD%EC%A0%95&name=%EC%9C%A4%EB%B4%89%EA%B8%B8&name=%EA%B9%80%EA%B5%AC&name=%ED%99%8D%EB%B2%94%EB%8F%84
  public String test2(String[] name) {
    return "=>  " + name[0]+","+name[1] + "," + name[2] + ","+ name[3] + ","+ name[4] + ","+ name[5] + ","+ name[6] + ",";
  }
}
