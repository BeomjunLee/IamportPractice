package iamport.practice.iamportpratice.repository;

import iamport.practice.iamportpratice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Long, Member> {
}
