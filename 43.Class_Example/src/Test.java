import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// Calisan sinifi olusturalim
		System.out.println("*************UYGULAMAYA HOŞGELDİNİZ*************");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen id giriniz : ");
		int id = input.nextInt();
		input.nextLine();					// nextInt metodunun sonunda \n olduğu için boşluk atıyor bu boşluğu okutmam gerek 
		
		System.out.print("Lütfen adınızı giriniz : ");
		String name = input.nextLine();
		
		System.out.print("Lütfen soyadınızı giriniz : ");
		String surname = input.nextLine();
		
		System.out.print("Lütfen deneyiminizi giriniz : ");
		int experience = input.nextInt();
		input.nextLine();
		
		System.out.print("Lütfen maaşınızı giriniz : ");
		double salary = input.nextDouble();
		
		Calisan calisan1 = new Calisan(id, name, surname, experience, salary); // Calisan sinifimdan  calisan 1 adinda 1 nesne oluşturdum 
		
		String islemlerMenu = "1-Çalışan bilgilerini görüntüle\n"
				+ "2-Zam yap\n"
				+ "3-Format at";
        System.out.println(islemlerMenu);
        System.out.print("Lütfen bir seçim yapınız : ");
        int secim = input.nextInt();
        input.nextLine();
        switch (secim) {
		case 1:
			calisan1.calisanBilgileri();
			break;
		case 2:
			System.out.print("İstediğiniz zam miktarını giriniz : "); // Bonkör bir patronuz :)
			int zamPrice = input.nextInt();
			input.nextLine();
			
			calisan1.zamYap(zamPrice);
			break;
		case 3 :
			
			System.out.print("Lütfen işletim sisteminizi giriniz : ");
			String isletimSistemi = input.nextLine();
			
			System.out.print("Kimin format atmasını istiyorsunuz? :  ");
			String kimFormat = input.nextLine();
			
			calisan1.formatAt(isletimSistemi, kimFormat);
			
			break;
		default: 
			System.out.println("LÜTFEN MENÜDE BELİRTİLEN ARALIKTA BİR SEÇİM YAPINIZ!!!");
			break;
			
		}
		
	
		
	
		
		input.close();
		
		
	}
}
