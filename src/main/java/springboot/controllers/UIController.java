package springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springboot.services.SocketService;

@Controller
@RequestMapping("/")
public class UIController {
	
	@Autowired
	SocketService socket;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "listener", method = RequestMethod.GET)
	public String listener(){
		return "listener";
	}
	
	@RequestMapping(value = "send", method = RequestMethod.GET)
	public void send(@RequestParam("room") String room, @RequestParam("message") String message){
		socket.sendMessage(room, message);
	}

}
