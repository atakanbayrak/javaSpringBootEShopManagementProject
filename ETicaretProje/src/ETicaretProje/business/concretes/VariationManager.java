package ETicaretProje.business.concretes;

import ETicaretProje.business.abstracts.VariationService;
import ETicaretProje.entities.concretes.User;

public class VariationManager implements VariationService{

	@Override
	public void message() {
		System.out.println("Do�rulama Mesaj� G�nderiliyor... ");
		
	}

	@Override
	public void click() {
		System.out.println("T�klama Ger�ekle�tirildi... ");
		
	}
	
	
}
