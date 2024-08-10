package model;

public class Kamyon extends Arac{ // Arac class'ını miras al
	
	private double trafikCezaTutari;

public Kamyon() {
}

public Kamyon(Long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String aracMarka,
		int modelYili,double trafikCezaTutari) {
	
	setId(id);
	setAracIsmi(aracIsmi);
	setRenk(renk);
	setFiyat(fiyat);
	setLastikSayisi(lastikSayisi);
	setAracMarka(aracMarka);
	setModelYili(modelYili);
	this.trafikCezaTutari=trafikCezaTutari; // this içerisinde olduğum class'ın demekti.

}

@Override
public void aracBilgileriGoster() {
	super.aracBilgileriGoster(); // super anahtar kelimesi kullanıldı
	System.out.println("ID : " + getId());
	System.out.println("ARAÇ İSMİ : " + getAracIsmi());
	System.out.println("RENK : " + getRenk());
	System.out.println("FİYAT : " + getFiyat());
	System.out.println("LASTİK SAYISI : " + getLastikSayisi());
	System.out.println("ARAÇ MARKA : " + getAracMarka());
	System.out.println("MODEL YILI : " + getModelYili());
	
}

@Override
public void trafikCezasiOde(double cezaTutar) { // override ile miras aldığım metodu geçersiz kılarak yeniden oluştuyorum içerisini
	super.trafikCezasiOde(cezaTutar);			// bu metoda super class'dan değil artık sub class'dan eriş demiş oluyorum.
	System.out.println(getAracIsmi() + " tipli aracın trafik cezası tutarı : " + getTrafikCezaTutari());


}

public double getTrafikCezaTutari() {
	return trafikCezaTutari;
}

public void setTrafikCezaTutari(double trafikCezaTutari) {
	this.trafikCezaTutari = trafikCezaTutari;
}







}
