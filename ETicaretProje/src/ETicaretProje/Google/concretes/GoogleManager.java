package ETicaretProje.Google.concretes;

import ETicaretProje.Google.abstarcts.IGoogle;
import ETicaretProje.entities.concretes.User;

public class GoogleManager implements IGoogle{

	@Override
	public void add(User user) {
		System.out.println("Google ile giriþ yapildi " + user.getName());
		
	}
	
}
