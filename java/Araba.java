class Araba {
	int kapi_sayisi;
	int vites_sayisi;
	public Araba(int adet, int sayi){
		kapi_sayisi=adet;
		vites_sayisi = sayi;
	}	
	public Araba ( int adet ){
		kapi_sayisi = adet ;
	}
	
	public static void main ( String args[] ) {
		
		Araba ar1 = new Araba (2);
		Araba ar2 = new Araba (4, 5);
		System.out.println ("kapı sayısi: "+ar1.kapi_sayisi);
		System.out.println ("kapı sayısi, vites sayisi: "+ar2.kapi_sayisi+" ,"+ ar2.vites_sayisi );
	}
}
