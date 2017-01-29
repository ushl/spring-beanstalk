package localhost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/")
@Controller
public class HelloController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String hello(
			@RequestParam(required = false, defaultValue = "world") String user,
			Model model
	) {
		model.addAttribute("user", user);

		return "hello";
	}

}
