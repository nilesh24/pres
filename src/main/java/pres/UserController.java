package pres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import pres.nilesh.models.UserInfo;
import ser.UserService;

@RestController
@RequestMapping(value = "/forms")
public class UserController {
	
	@Autowired
	UserService userService;

	public UserController() {
		System.out.println("In construc User ctrl");
	}

	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public ModelAndView login(){
		return new ModelAndView("Login");
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public UserInfo addUser(@ModelAttribute UserInfo user) {

		System.out.println("in addUser method ::" + user);
		userService.addUserDetails(user);
		System.out.println("addUser completed");
		return user;
	}
	
	@RequestMapping(value="/getUser", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserInfo> getUser(@RequestParam String name){
		
		return userService.getUserInfo(name);
		
	}

}
