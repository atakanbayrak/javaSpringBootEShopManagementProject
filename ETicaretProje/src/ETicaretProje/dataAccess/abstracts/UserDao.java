package ETicaretProje.dataAccess.abstracts;

import ETicaretProje.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	
	
}
