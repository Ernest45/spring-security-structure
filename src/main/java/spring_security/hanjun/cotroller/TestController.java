package spring_security.hanjun.cotroller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";

    }

}
