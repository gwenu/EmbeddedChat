package ag.embedded.chat.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Embedded chat</h3> **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
