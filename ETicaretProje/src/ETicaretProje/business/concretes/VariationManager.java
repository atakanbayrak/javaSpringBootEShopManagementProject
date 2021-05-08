package ETicaretProje.business.concretes;

import ETicaretProje.business.abstracts.VariationService;
import ETicaretProje.entities.concretes.User;

public class VariationManager implements VariationService{

	@Override
	public void message() {
		System.out.println("Doðrulama Mesajý Gönderiliyor... ");
		
	}

	@Override
	public void click() {
		System.out.println("Týklama Gerçekleþtirildi... ");
		
	}
	
	
}
