package umc.spring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring1.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
