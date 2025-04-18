package spring_security.hanjun.cotroller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {


    @GetMapping("/user")
    public String user() {
        return "user test";

    }

    @GetMapping("/admin")
    public String admin() {
        return "admin test";

    }

}
