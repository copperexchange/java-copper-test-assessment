package copper.co.test;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ExampleController {

    @GetMapping(path = "/ping")
	public String ping() {
		return "pong";
	}
}
