package shop.mtcoding.blogexp.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/")
    public String home(){
        return "index";
    }

    
}
