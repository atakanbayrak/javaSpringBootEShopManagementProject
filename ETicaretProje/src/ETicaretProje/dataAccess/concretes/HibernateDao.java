package ETicaretProje.dataAccess.concretes;

import ETicaretProje.dataAccess.abstracts.UserDao;
import ETicaretProje.entities.concretes.User;

public class HibernateDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanici Hibernate ile Eklendi " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanici Hibernate ile Silindi " + user.getName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanici Hibernate ile Guncellendi " + user.getName());
		
	}

	
	
	

	

}
