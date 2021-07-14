package com.xworkz.dp.message;

import com.xworkz.dp.message.MessageDTO;

public class MessageTester {
	
	public static void main(String[] args) {

		MessageDTO messageDTO=new MessageDTO();
		messageDTO.setRecieving(20);
		messageDTO.setSending(true);
		messageDTO.setDeleting(40.00d);
		messageDTO.setDropbox(1000);
		
		 System.out.println(messageDTO);
		 
		 MessageDTO messageDTO5=new MessageDTO(40,false,60.32d,300);
		 
		 System.out.println(messageDTO5);

	}
	

	
}
