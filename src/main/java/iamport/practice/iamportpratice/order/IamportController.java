package iamport.practice.iamportpratice.order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class IamportController {
    private final OrderRepository orderRepository;

    @GetMapping("/")
    public String main() {
        return "index";
    }

    /**
     * 결제 정보 입력
     */
    @PostMapping("/pay")
    public String pay(OrderForm orderform, Model model) {
        Order order = Order.builder()
                .name(orderform.getName())
                .price(orderform.getPrice())
                .item(orderform.getItem())
                .createdDate(LocalDateTime.now())
                .build();
        Order savedOrder = orderRepository.save(order);

        model.addAttribute("order", savedOrder);
        return "pay";
    }

    /**
     * 결제가 실패하면 취소됨 
     */
    @PostMapping("/deletePay")
    public String deletePay(@RequestParam("id") Long id) {
        orderRepository.deleteById(id);
        return "index";
    }

    /**
     * 결제 성공시
     */
    @PostMapping("/payComp")
    public String completePay(@RequestBody EndPointDto dto) {
        return "";
    }

//    public String getToken(HttpServletRequest request){
//
//        String token;
//
//        return token;
//    }
}
