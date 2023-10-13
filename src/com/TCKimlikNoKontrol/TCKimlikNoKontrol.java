package com.TCKimlikNoKontrol;

import java.util.Scanner;
import com.TCKimlikNoKontrol.TCKimlikNo;

public class TCKimlikNoKontrol {

	public static void main(String[] args) {
		
		System.out.println("Bu console uygulaması kullanıcıdan alınan TC KimlikNumarasının doğruluğunu kontrol eder");
		System.out.println("TC Kimlik Numarası Kontrol Ekranına Hoş Geldiniz...\nÇıkmak istediğiniz zaman q girişi yapabilirsiniz.");
		
		String tCKimlikNo = "";
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.print("Lütfen TC Kimlik Numarasını Giriniz: ");
			tCKimlikNo=scanner.nextLine();
			TCKimlikNo tCKimlikNoKontrolKimlikNo=new TCKimlikNo(tCKimlikNo);
			
			if (tCKimlikNoKontrolKimlikNo.TCKimlikNoDogruMu) {
				System.out.println("Giriş yapılan "+tCKimlikNo+"  TC Kimlik numarası doğrudur.");
			} else {
				System.out.println("Giriş yapılan "+tCKimlikNo+"  TC Kimlik numarası hatalıdır.");
			}
			
		} while (tCKimlikNo!="q");

	}

}
