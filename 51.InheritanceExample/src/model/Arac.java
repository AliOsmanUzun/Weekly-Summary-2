package model;


public class Arac {
	
	// super class'ımda  private değişken olan nesneleri , sub class'dan türetmiş olduğum nesne içinde barındırıyor zaten,
	// sadece private olduğu için erişim yolu farklı oluyor , bunu da getter ve setter ile yapıyoruz.

	private Long id;
	
	private String aracIsmi;
	
	private String renk;
	
	private double fiyat;
	
	private int lastikSayisi;
	
	private String aracMarka;
	
	private int modelYili;
	
	public Arac() {
	}

	public Arac(Long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String aracMarka,
			int modelYili) {
		this.id = id;
		this.aracIsmi = aracIsmi;
		this.renk = renk;
		this.fiyat = fiyat;
		this.lastikSayisi = lastikSayisi;
		this.aracMarka = aracMarka;
		this.modelYili = modelYili;
	}
	
	public void aracBilgileriGoster() {
		System.out.println("ARAÇ BİLGİLERİ");
		System.out.println("---------------");
		
	}

	public void trafikCezasiOde(double cezaTutar) {
		System.out.println("TRAFİK CEZASI");
		
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAracIsmi() {
		return aracIsmi;
	}

	public void setAracIsmi(String aracIsmi) {
		this.aracIsmi = aracIsmi;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public int getLastikSayisi() {
		return lastikSayisi;
	}

	public void setLastikSayisi(int lastikSayisi) {
		this.lastikSayisi = lastikSayisi;
	}

	public String getAracMarka() {
		return aracMarka;
	}

	public void setAracMarka(String aracMarka) {
		this.aracMarka = aracMarka;
	}

	public int getModelYili() {
		return modelYili;
	}

	public void setModelYili(int modelYili) {
		this.modelYili = modelYili;
	}
	
	
	
	
	
}
