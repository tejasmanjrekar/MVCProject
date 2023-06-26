package day20;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //marks this class a controller of Spring MVC
public class SpringMvcController {
	@RequestMapping("/getIndex")
	public String handleRequest() {
		System.out.println("Handling req");
		return "index";
		}
	@RequestMapping("/getLogin")
	public String getLoginPage() {
		return "login";
	}
	
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	//Configures this method to accept HTTP POST request against the URL: /validate
	public String doValidate(@RequestParam("uid") String userName, @RequestParam("pwd") String password) {
		String resultPage = "failure";
		if(userName.equals("admin") && password.equals("root"))
			resultPage = "success";
		return resultPage;
	}
}
