package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    // 아래에서 만든 memberRepository를 memberService 빈을 만들 때 사용
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    // memberRepository를 상속받는 MemoryMemberRepository를 빈으로 만들어 줌
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
