package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "AEIOU!!");
//        resources/templates/hello를 리턴해라
        return "hello";
    }

    @GetMapping("hello-mvc")
    // GET 방식으로 param 넘기기 주소 뒤에 ?로 쿼리 연결
    public String helloMvc(@RequestParam(value = "name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // Http body에 직접 넣어주겠다는 어노테이션
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // "hello spring" 템플릿 엔진과의 차이점, 이 문자가 그대로 나감
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi  (@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
