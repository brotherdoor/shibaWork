package music;

import org.springframework.stereotype.Component;

@Component
public class Singer implements Player{

	@Override
	public void play() {
		System.out.println("�뷡 �θ���");
	}

}