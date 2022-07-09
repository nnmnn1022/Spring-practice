package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

//@Repository // 데이터 저장
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) { //회원가입
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) { //회원 전체 조회
        // store의 값이 null일 수도 있으므로 아래와 같이 반환
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) { // 이름으로 찾기

        return store.values().stream().
                filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clareStore() {
        store.clear();
    }
}
