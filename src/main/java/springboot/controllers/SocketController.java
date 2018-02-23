package springboot.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SocketController {
    
	@MessageMapping("/socket/{room}")
    @SendTo("/socket/listner/{room}")
    public String listen(@PathVariable String room, @RequestBody String message) throws Exception {
        return message;
    }
	
}
