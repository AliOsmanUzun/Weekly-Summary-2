import java.util.Random;

public class TCKN {

	private Long id;
	
	private String dogumyeri;
	
	private String tckn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDogumyeri() {
		return dogumyeri;
	}

	public void setDogumyeri(String dogumyeri) {
		this.dogumyeri = dogumyeri;
	}

	public String getTckn() {
		return tckn;
	}
		boolean kontrol = true;
	public void setTckn(String tckn) { // Bir String nesnesinin karakter sayısının uzunluğunu elde etmek için .length() metodu kullanılır. Diziler'in uzunluğunuda .length ile hesaplayabiliriz.
		
		if(tckn.length()==11) { 
		
			for (int i = 0; i <tckn.length(); i++) {  			
					char karakter = tckn.charAt(i);  
				if (Character.isDigit(karakter)) {                              						  // Character.isDigit(char ch) metodu, parametre olarak verilen karakterin sayısal bir karakter olup olmadığını kontrol eder. 
			// Eğer bu bir sayı ise  true değer dönmüş ise resulta true değer ata                        // Eğer karakter bir rakam ise true, değilse false döner. Boolean veri tipinde geri dönüş yapıyor
					kontrol=true; 
				} 
				else { 
					kontrol=false;
					break; // Rakam yerine bir harf var ise direkt döngüyü kır demiş oldum
				}
				
			}
			if(kontrol) { // Sonuç true  ise burayı çalıştır demiş oldum.
				this.tckn=tckn;
				// Random sınıfı rastgele değer üretmek için kullanılan bir sınıftır.
				
				Random random = new Random(); // Random sınıfından random referans ismine sahip bir obje oluşturdum
				
				// 0 - 1000 arası rastgele bir değer üret
				 int giseNo = random.nextInt(1000); // int bound parametresi ile girilen aralık 0 ile o aralıkta random bir değer üretiyor
				
				 System.out.println("GİŞE NO : " + giseNo);
			}
			else {
				tcknHataMesaj("Lütfen bütün karakterleri rakam olacak şekilde giriniz!!!");
			}
			
		} else { // 11 eşit değil ise ekrana hata mesajını ver dedik
			tcknHataMesaj("Eksik TCKN numarası girdiniz.TCKN numaranız 11 haneli olmak zorundadır");

		}
			
		
		
		// Java'da charAt() metodu, bir String ifade içerisindeki belirli bir konumdaki karakteri elde etmek için kullanılır.
		// Bu metot, belirli bir indeks verildiğinde o indekste bulunan karakteri döndürür.
		// İndeksleme sıfırdan başlar, yani ilk karakterin indeksi 0'dır.
	}
	
	public void tcknHataMesaj(String hatamesaj) {
		System.out.println(hatamesaj);
	}
	
}
