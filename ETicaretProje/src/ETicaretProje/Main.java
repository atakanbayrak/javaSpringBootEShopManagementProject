package ETicaretProje;



import ETicaretProje.business.abstracts.AuthService;
import ETicaretProje.business.abstracts.UserService;
import ETicaretProje.business.concretes.AuthManager;
import ETicaretProje.business.concretes.UserManager;
import ETicaretProje.business.concretes.VariationManager;
import ETicaretProje.core.abstracts.typeOfRegister;
import ETicaretProje.core.concretes.RegisterManagerAdapter;
import ETicaretProje.dataAccess.concretes.HibernateDao;
import ETicaretProje.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateDao(), new RegisterManagerAdapter(), new VariationManager());		
		
		AuthService	authMan = new AuthManager();
		
		User user1 = new User();
		User user2 = new User();		
		
		user1.setId(1);
		user1.setName("Atakan");
		user1.setLastName("Bayrak");
		user1.setEmail("atakanbayrak@hotmail.com");
		user1.setPassword(123456);
		
		user2.setId(1);
		user2.setName("Atakan");
		user2.setLastName("Bayrak");
		user2.setEmail("atakanbayrassk@hotmail.com");
		user2.setPassword(123445);		
		
		userService.add(user1);
		userService.add(user2);		
		
		authMan.login(user1, userService);
		
		
	}

}
