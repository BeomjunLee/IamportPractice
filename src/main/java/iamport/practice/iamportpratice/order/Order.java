package iamport.practice.iamportpratice.order;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "orders") //테이블 이름 order는 불가능하므로
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;                            //order pk
    private String name;                        //주문자
    private String item;                        //주문 상품
    private int price;                          //주문 가격
    private LocalDateTime createdDate;          //주문 시간
}
