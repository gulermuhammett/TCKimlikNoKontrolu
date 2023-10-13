package com.TCKimlikNoKontrol;

public class TCKimlikNo {

	private String tCKimlikNo;
	String sonuc;
	public TCKimlikNo(String tCKimlikNo) {
		this.tCKimlikNo=tCKimlikNo;
		this.TCKimlikNoDogruMu=TCKimlikNo();
	}
	
	public boolean TCKimlikNoDogruMu;
	
	private boolean TCKimlikNo() {
		//27236390934 Örnek TC
		
		int[] TCRakamlar=new int[11];
		
		
		if (tCKimlikNo.length()!=11 && tCKimlikNo.charAt(0)==0) {
			return false;
		} else {
			for (int i = 0; i < 11; i++) {
			    TCRakamlar[i] = Character.getNumericValue(tCKimlikNo.charAt(i));
			}
			
			if (OnuncuRakam(TCRakamlar)!=TCRakamlar[9]) {
				return false;
			} else {
				
				if (OnBirinciRakam(TCRakamlar)!=TCRakamlar[10]) {
					return false;
				} else {
					return true;
				}
			}
		}
	}
	
	//ilk 9 rakamın tek hanelerin toplamının 7 katından çift hanelerin toplamını çıkarılmasıyla elde edilen sayının 1'ler basamağındaki değeri bulunur.
	private int OnuncuRakam(int[] TCRakamlar) {
		
		int OnuncuRakamTekTop=0;
		int OnuncuRakamCiftTop=0;
		
		for (int i = 0; i < 9; i++) {
			if (i==0 || i%2==0) {
				OnuncuRakamTekTop += TCRakamlar[i];
			} else {
				OnuncuRakamCiftTop += TCRakamlar[i];
			}
		}
		String onuncuRakam= String.valueOf(OnuncuRakamTekTop*7-OnuncuRakamCiftTop);
		return Character.getNumericValue(onuncuRakam.charAt(onuncuRakam.length()-1));
	}
	
	// ilk 10 basamağın toplamının 1'ler basamağını bulur
	private int OnBirinciRakam(int[] TCRakamlar) {
		
		int onRakamTop=0;
		
		for (int i = 0; i < 10; i++) {
			onRakamTop+=TCRakamlar[i];
		}
		
		String onBirinciRakam=String.valueOf(onRakamTop);
		return Character.getNumericValue(String.valueOf(onBirinciRakam).charAt(onBirinciRakam.length()-1));
	}
	
}
