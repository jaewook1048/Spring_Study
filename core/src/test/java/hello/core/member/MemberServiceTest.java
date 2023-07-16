package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

	// JUnit을 이용한 테스트 
	
	MemberService memberService = new MemberServiceImpl();

	@Test
	void Join() {

		// given : 어떠한 환경이 들어왓을 때
		Member member = new Member(1L, "memberA", Grade.VIP);

		// when : 이 기능을 수행하면
		memberService.join(member);
		Member findMember = memberService.findMember(1L);

		// then : 결과가 이렇게 나온다
		Assertions.assertThat(member).isEqualTo(findMember);

	}

}
