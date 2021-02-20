package iamport.practice.iamportpratice.repository;

import iamport.practice.iamportpratice.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Long, Order> {
}
