
public class Calisan {
	
	public int id ; 
	
	public String name;
	
	public String surname;
	
	public int experience;// Tecrübe , deneyim
	
	public double salary; // Maaş
	

	public Calisan() {
	}
	
	public Calisan(int id,String name,String surname,int experience,double salary ) { // Bu işlemi alt + shift + s  kısa yolu ile hızlıca yapabilirim
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.experience=experience;
		this.salary=salary;
	}
	
	public void calisanBilgileri() {
		System.out.println("***********ÇALIŞAN BİLGİLERİ***********");
		System.out.println("ID : "+ this.id);
		System.out.println("NAME : " + this.name);
		System.out.println("SURNAME : " + this.surname);
		System.out.println("EXPERIENCE : " + this.experience);
		System.out.println("SALARY : "+ this.salary);
		
	}
	
	public void zamYap(int zamprice) {
		System.out.println("Maaşınıza " + zamprice + " TL zam yapıldı. ");
		System.out.println("NEW SALARY : "+ (zamprice+salary));
	}
	
	public void formatAt(String isletimSistemi, String atanKim) {
		System.out.println(isletimSistemi + " işletim sisteminize  " + atanKim + " tarafından şuan format atılıyor");
		
	}
	
	
}
