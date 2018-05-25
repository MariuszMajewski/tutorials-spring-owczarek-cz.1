package implementation;

import java.util.Date;

import api.Logger;

public class LoggerImp implements Logger{

	public void log(String message) {
		System.out.println(new Date()+" "+ message);
		
	}

}
