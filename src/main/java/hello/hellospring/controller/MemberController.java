package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// 컨트롤러를 통해서 외부 요청을 받는다.
// 컨트롤러는 어쩔 수 없다. 스프링이 관리하는 친구
@Controller //@Controller라는 어노테이션이 있으면 스프링이 시작될 때 객체를 생성해서 준비 중 스프링 빈이 관리된다. 컴포넌트 스캔 방식
public class MemberController {
    // private final MemberService memberService = new MemberService(); 매번 새로운 객체를 생성할 필요가 없다.
    private final MemberService memberService;

    @Autowired //생성자를 생성할 때 스프링빈에 들어있는 멤버 서비스를 자동으로 주입, DI 의존성 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }

    @PostMapping("/members/new") // Get / Post에
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

}
