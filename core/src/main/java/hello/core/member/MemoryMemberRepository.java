package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

	// 일반 HashMap은 동시성 이슈가 발생할 수 있지만 예제이므로 그냥 사용
	private static Map<Long, Member> store = new HashMap<>();

	@Override
	public void save(Member member) {
		store.put(member.getId(), member);

	}

	@Override
	public Member findById(Long memberId) {
		return store.get(memberId);
	}

}
