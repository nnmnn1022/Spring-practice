package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

//    Test가 한 번 끝날 때 마다 repository를 비워주도록 함.
//    그렇지 않으면 순서에 의존한 테스트가 되기 때문에 신뢰성을 얻기 힘듦
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("Umoo");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
//        Assertions : org.junit.jupiter.api
//        Assertions.assertEquals(result, member);

//        Assertions : org.assertj.core.api
//        member가 result의 값과 같은지 검증
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("Spring1");
        repository.save(member1);

//        shift + F6 으로 방금 복사한 내용들을 일괄 치환할 수 있음
        Member member2 = new Member();
        member2.setName("Spring2");
        repository.save(member2);

        Member result = repository.findByName("Spring1").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("Spring1");
        repository.save(member1);

//        shift + F6 으로 방금 복사한 내용들을 일괄 치환할 수 있음
        Member member2 = new Member();
        member2.setName("Spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }
}
