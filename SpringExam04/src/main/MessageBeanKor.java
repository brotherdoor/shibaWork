package main;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageBeanKor implements MessageBean{
	
	@Value("Çü¹®")
	private String name;
	
	@Value("¾È³ç¾²")
	private String greeting;
	
	@Autowired
	private Outputter outputter;
	
	public MessageBeanKor(String name) {
		this.name = name;
	}
	
	public MessageBeanKor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello() {
		String message = greeting + " " + name;
		System.out.println(message);
		
		try {
			outputter.output(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}