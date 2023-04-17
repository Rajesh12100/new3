package mail.sending;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	@RequestMapping("/welcome")
	public String welcome2() {
		
		return "hello";
	}
}
