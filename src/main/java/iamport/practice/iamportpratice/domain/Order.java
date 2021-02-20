package iamport.practice.iamportpratice.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders") //테이블 이름 order는 불가능하므로
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;                            //order pk
    private String name;                        //주문 상품 이름
    private int count;                          //주문 수량
    private LocalDateTime createdDate;          //주문 시간
}
