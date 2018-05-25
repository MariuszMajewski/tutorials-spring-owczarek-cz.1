import api.Logger;
import api.UsersRepository;
import domain.User;
import implementation.LoggerImp;
import implementation.UsersRepositoryImp;
public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImp();
		UsersRepository usersRepository = new UsersRepositoryImp();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("Mariusz");

	}
}