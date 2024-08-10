import java.util.Scanner;

import model.Kamyon;
import model.Motorsiklet;

public class MainClass {

	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("ARAÇ UYGULAMASINA HOŞGELDİNİZ!\n");
	

	
	String girisMenu="1-Kamyon\n"
			        +"2-Motorsiklet\n";
	
	
	System.out.println(girisMenu+"\n"); // alt satıra geç = \n
	
	System.out.print("Lütfen bir seçim yapınız : ");
	int secim = scanner.nextInt();
	scanner.nextLine();
	
	
	if (secim==1) {
		// Kamyon islemleri
		System.out.print("Kamyon ID : ");
		Long kamyonId = scanner.nextLong();
		scanner.nextLine();
		
		System.out.print("Araç İsmi : ");
		String kamyonIsim = scanner.nextLine();
		
		System.out.print("Araç Renk : ");
		String kamyonRenk = scanner.nextLine();
		
		System.out.print("Araç Fiyat : ");
		double kamyonFiyat = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Araç Lastik Sayısı : ");
		int kamyonLastik = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Araç Marka : ");
		String kamyonMarka = scanner.nextLine();
		
		System.out.print("Araç Model Yılı : ");
		int kamyonModelYil = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Trafik Cezası Tutarınız : ");
		double kamyonCeza = scanner.nextDouble();
		scanner.nextLine();
		
		
		Kamyon kamyon = new Kamyon(kamyonId, kamyonIsim, kamyonRenk, kamyonFiyat, kamyonLastik, kamyonMarka, kamyonModelYil,kamyonCeza);
		System.out.println("1-Kamyonun bilgilerini göster\n"
						  +"2-Trafik Cezası Öde");
		System.out.print("Seçim yapınız : ");
		int kamyonSecim = scanner.nextInt(); // Menü seçimi al kullanıcıdan
		if (kamyonSecim==1) {
			// Kamyon Bilgilerini Goster
			kamyon.aracBilgileriGoster();
		}
		else if (kamyonSecim==2) {
			// Trafik cezası tutarını göster
			kamyon.trafikCezasiOde(kamyonCeza);
			System.out.println(kamyonCeza + " TL cezanız ödenmiştir.");
		}
		else {
			System.out.println("Lütfen kamyon menüsü için geçerli bir rakam giriniz! ");
		}
		
		
	}
	else if (secim==2) {
		// Motorsiklet ismeleri
		
		System.out.print("Motor ID : ");
		Long motorId = scanner.nextLong();
		scanner.nextLine();
		
		System.out.print("Motor İsmi : ");
		String motorIsim = scanner.nextLine();
		
		System.out.print("Motor Renk : ");
		String motorRenk = scanner.nextLine();
		
		System.out.print("Motor Fiyat : ");
		double motorFiyat = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Motor Lastik Sayısı : ");
		int motorLastik = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Motor Marka : ");
		String motorMarka = scanner.nextLine();
		
		System.out.print("Motor Model Yılı : ");
		int motorModelYil = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Trafik Cezası Tutarınız : ");
		double motorCeza = scanner.nextDouble();
		scanner.nextLine();
		
		
		Motorsiklet motor = new Motorsiklet(motorId, motorIsim, motorRenk, motorFiyat, motorLastik, motorMarka, motorModelYil,motorCeza);
		System.out.println("1-Kamyonun bilgilerini göster\n"
				  +"2-Trafik Cezası Öde");
		System.out.print("Seçim yapınız : ");
		int motorSecim = scanner.nextInt();
		if (motorSecim == 1) {
			motor.aracBilgileriGoster();
		} else if (motorSecim == 2) {
			motor.trafikCezasiOde(motorCeza);
			System.out.println(motorCeza + " TL cezanız ödenmiştir");
		} else {
			System.out.println("Lütfen motor menüsü  için geçerli bir rakam giriniz! ");
		}
	}
	else {
		// Geçersiz secim
		System.out.println("HATALI SEÇİM YAPTINIZ !!! , LÜTFEN MENÜDE BELİRTİLEN ARALIKTA BİR SEÇİM YAPINIZ");
	}
	scanner.close();
	}
	
}
