package closet.domain.repository;

import closet.domain.display.entity._Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface _MemberRepository extends JpaRepository<_Member, Long> {
}
