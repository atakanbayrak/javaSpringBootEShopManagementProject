package ETicaretProje.business.concretes;


import java.util.List;

import ETicaretProje.business.abstracts.AuthService;
import ETicaretProje.business.abstracts.UserService;
import ETicaretProje.entities.concretes.User;

public class AuthManager implements AuthService{

	private List<User> liste;
	private UserService userService;
	
	public AuthManager() {
		
	}
	
	@Override
	public void login(User user,UserService userService) {
		
		this.liste = userService.getAll();
		
		for (User user_ : liste) {
			if(user_.getEmail() != user.getEmail() || user_.getPassword() != user.getPassword()) {
				System.out.println("Giriþ Baþarýsýz");
				break;
			}
			else {
				System.out.println("Giriþ Baþarýlý");
				break;
			}
		}	
		
		
		
		
	}

	

	
	

	

}
