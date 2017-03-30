package main;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileOutputter implements Outputter{
	
	@Value("out.txt")
	private String filePath;

	@Override
	public void output(String messagae) throws IOException {
		FileWriter out = new FileWriter(filePath);
		out.write(messagae);
		out.close();
	}

}
