import java.util.Scanner;

public class AnaSinif {
			public static void main(String[] args) {
		// Gişe uygulaması yapalım tc si doğru ise numara versin yanlış girerse uyarsın.
				
		// Gişe numarasını vermek için random bir değer üretilim . Java'da eğer random değer üretmek istiyorsak Random sınıfını kullanıyoruz.
				
			
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("*********************Gişe Uygulamasına Hoşgeldiniz*********************"); 
		
		System.out.print("Lütfen TCKN numaranızı giriniz : ");
		String tckn = scanner.nextLine();
		
		TCKN tcknObject = new TCKN(); 
		
		tcknObject.setTckn(tckn); 
		
		 
		scanner.close();
		
				
				
				

			}
}
