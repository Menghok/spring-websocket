package springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;


@Service
public class SocketService{

	@Autowired
    private SimpMessagingTemplate template;
	
	public void sendMessage(String room, String message){
		System.out.println("SENDING TO: >>> " + room);
        template.convertAndSend("/socket/listner/"+room, message);
	}
		
}