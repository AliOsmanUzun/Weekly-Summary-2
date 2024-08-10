package model;

public class Motorsiklet extends Arac { // Arac class'ını miras al
	private double trafikCezaTutari;
	
	public Motorsiklet() {
	}
	
	public Motorsiklet(Long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String aracMarka,
			int modelYili,double trafikCezaTutari ) {
		
		setId(id);
		setAracIsmi(aracIsmi);
		setRenk(renk);
		setFiyat(fiyat);
		setLastikSayisi(lastikSayisi);
		setAracMarka(aracMarka);
		setModelYili(modelYili);
		this.trafikCezaTutari=trafikCezaTutari;
		
	}

	@Override
	public void aracBilgileriGoster() {
		super.aracBilgileriGoster();
		System.out.println("ID : " + getId());
		System.out.println("ARAÇ İSMİ : " + getAracIsmi());
		System.out.println("RENK : " + getRenk());
		System.out.println("FİYAT : " + getFiyat());
		System.out.println("LASTİK SAYISI : " + getLastikSayisi());
		System.out.println("ARAÇ MARKA : " + getAracMarka());
		System.out.println("MODEL YILI : " + getModelYili());
		
	}

	@Override
	public void trafikCezasiOde(double cezaTutar) {
		super.trafikCezasiOde(cezaTutar);
		System.out.println(getAracIsmi() + " tipli aracın trafik cezası tutarı : " + getTrafikCezaTutari());

	}

	public double getTrafikCezaTutari() {
		return trafikCezaTutari;
	}

	public void setTrafikCezasiTutari(double trafikCezaTutari) {
		this.trafikCezaTutari = trafikCezaTutari;
	}
	
	
}
