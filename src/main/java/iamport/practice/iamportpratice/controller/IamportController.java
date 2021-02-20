package iamport.practice.iamportpratice.controller;

import iamport.practice.iamportpratice.repository.MemberRepository;
import iamport.practice.iamportpratice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class IamportController {
    private final MemberRepository memberRepository;
    private final OrderRepository orderRepository;

}
