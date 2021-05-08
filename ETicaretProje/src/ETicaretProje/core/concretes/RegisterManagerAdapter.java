package ETicaretProje.core.concretes;

import ETicaretProje.Google.abstarcts.IGoogle;
import ETicaretProje.Google.concretes.GoogleManager;
import ETicaretProje.core.abstracts.typeOfRegister;
import ETicaretProje.entities.concretes.User;

public class RegisterManagerAdapter implements typeOfRegister{

	@Override
	public void register(User user) {
		IGoogle Igoogle = new GoogleManager();
		Igoogle.add(user);
		
	}

	

}
