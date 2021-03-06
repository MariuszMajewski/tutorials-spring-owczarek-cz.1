import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import api.UsersRepository;
import domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		UsersRepository usersReposytory = context.getBean("repozytoriumUzytkownikow", UsersRepository.class);
		
		User user = usersReposytory.createUser("Mariusz");
	}

}
