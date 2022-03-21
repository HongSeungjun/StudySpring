package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
    
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        //given : 이런게 주어졌을 때
        Member member = new Member(1L,"memberA",Grade.VIP);

        //when : 언제
        memberService.join(member);
        Member findMember = memberService.findMember(1l);

        //then : 어떻게 되느냐
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
