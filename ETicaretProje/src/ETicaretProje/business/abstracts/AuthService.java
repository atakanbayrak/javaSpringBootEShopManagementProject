package ETicaretProje.business.abstracts;

import java.util.List;

import ETicaretProje.entities.concretes.User;

public interface AuthService {
	
	void login(User user, UserService userService);
	
	
	
}
