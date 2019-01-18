package in.sjstudio.springsecurity.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/admin/hello")
	public String adminHello() {
		return "admin hello";
	}

	@GetMapping("/user/hello")
	public String userHello() {
		return "user hello";
	}

}
