package ETicaretProje.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ETicaretProje.business.abstracts.UserService;
import ETicaretProje.business.abstracts.VariationService;
import ETicaretProje.core.abstracts.typeOfRegister;
import ETicaretProje.dataAccess.abstracts.UserDao;
import ETicaretProje.entities.concretes.User;

public class UserManager implements UserService{

	private VariationService variationService;
	private UserDao	userDao;
	private typeOfRegister tOR;
	private List<User> users = new ArrayList<User>();
	
	private String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	
	public UserManager() {
		
	}

	public UserManager(UserDao userDao, typeOfRegister tOR, VariationService variationService) {
		
		this.userDao = userDao;		
		this.tOR = tOR;
		this.variationService = variationService;
	}

	@Override
	public void add(User user) {		
		Matcher matcher = pattern.matcher(user.getEmail());
			if(users.isEmpty()) {				
				
				if(matcher.matches()) {
					if(user.getPassword() <= 999 ) {
						System.out.println("Kayit Yapilamadi- Þifre En Az 6 Haneli Olmalý");
					}
					else {
						if(user.getName().length() <= 2 || user.getLastName().length() <= 2) {
							System.out.println("Kayit Yapilamadi- Ýsim/Soyisim En Az 2 Haneli Olmalý");
						}
						else {
							variationService.message();
							variationService.click();
							System.out.println("Baþarýlý Bir Þekilde Eklendi");
							users.add(user);
							userDao.add(user);
							
						}
						
					}					
					
				}
				else {
					System.out.println("Hatalý Bir Girdi Yapildi Eklenmedi");
				}				
			}
			else{
				for (User user_ : users) {
					if(user_.getEmail()==user.getEmail()) {						
						System.out.println("Kayitli- Ekleme Yapýlamadý");
						break;
					}
					else {						
						if(matcher.matches()) {
							if(user.getPassword() <= 999 ) {
								System.out.println("Kayit Yapilamadi- Þifre En Az 6 Haneli Olmalý");
							}
							else {
								if(user.getName().length() <= 2 || user.getLastName().length() <= 2) {
									System.out.println("Kayit Yapilamadi- Ýsim/Soyisim En Az 2 Haneli Olmalý");
								}
								else {
									variationService.message();
									variationService.click();									
									System.out.println("Baþarýlý Bir Þekilde Eklendi");
									users.add(user);
									tOR.register(user);
									break;
								}
								
							}
							
						}
						else {
							System.out.println("Eklenmedi");
							break;
						}
					}
				}				
			}
			
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}
	
	
	
}
