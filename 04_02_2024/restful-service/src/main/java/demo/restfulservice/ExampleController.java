package demo.restfulservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Example")
public class ExampleController {

    @GetMapping("/")
    public String Get(){
        return "Hello Student!";
    }
}
