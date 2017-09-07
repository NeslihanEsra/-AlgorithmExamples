package course.vektorel.algoritmalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class algoritmalar {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		algoritmalar inst = new algoritmalar();
		inst.algo14();
	}

	// Klavyeden girilen n adet notun ortalamasý
	private void algo1() {
		System.out.println("Kaç tane not gireceksiniz?");
		int nTane = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nTane; i++) {
			System.out.println((i + 1) + ". notunuzu giriniz:");
			list.add(scan.nextInt());
		}
		int toplam = 0;
		for (Integer toplamList : list) {
			toplam += toplamList;
		}
		System.out.println("Sayýlarýn Ortalamasý: " + (toplam / nTane));

	}

	// Klavyeden girilen n adet notun en büyük ve en küçüðünü bulma
	private void algo2() {
		System.out.println("Kaç tane sayý gireceksiniz?");
		int nTane = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nTane; i++) {
			System.out.println("Sayý giriniz:");
			list.add(scan.nextInt());
		}
		list.sort(null); // default olarak sayýlar küçükten büyüðe sýralanýr
		System.out.println("En küçük sayi: " + list.get(0)); // listen bir dizi
																// çaðýrýlýr
		System.out.println("En büyük sayi: " + list.get(nTane - 1));
	}

	// Klavyeden girilen 5 adet sayýnýn 10dan büyük olanlarýný sayma
	private void algo3() {
		System.out.println("-5 tane sayý girmelisiniz-");
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". sayýnýzý giriniz:");
			list.add(scan.nextInt());
		}
		int sayac10 = 0;
		for (Integer sayiList : list) {
			if (sayiList > 10) {
				sayac10++;
			}
		}
		System.out.println("10'dan büyük olan toplam " + sayac10 + " tane sayý vardýr.");
	}

	// Klavyeden 0 sayýsý girilene kadar sayýlar okutup
	// Girilen sayýlarýn 2 katýný alarak ekrana yazdýrma
	private void algo4() {
		List<Integer> list = new ArrayList<>();
		int sayi = 1;
		while (sayi != 0) {
			System.out.println("Sayý giriniz:");
			sayi = scan.nextInt();
			if (sayi != 0) {
				list.add(sayi);
			}
		}
		for (Integer carpimList : list) {
			System.out.println("Girilen sayýlarýn 2 katý: " + carpimList * 2);
		}
	}

	// 30 kiþilik sýnýfta (Random 10 ile 15 aralýðýnda ), yaþý 13 ile 15
	// arasýnda olanlarýn sayýsýný bulma
	private void algo5() {
		Random rand = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			int random = rand.nextInt(5);
			random += 10; // random sayýnýn 10-15 arasýnda olmasý için bu iþlem
							// uygulanýr
			list.add(random);
		}
		System.out.println("Rastgele üretilen sayýlar:" + list);
		int sayac = 0;
		for (Integer sayiList : list) {
			if (sayiList >= 13 && sayiList <= 15) {
				sayac++;
			}
		}
		System.out.println("13 ile 15 arasýndaki toplam sayý: " + sayac);
	}

	// 30 kiþilik sýnýfta (Random 10 ile 15 aralýðýnda ) yaþý 13, 14
	// olanlarýn sayýsýný ayrý ayrý bulma
	private void algo6() {
		Random rand = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			int random = rand.nextInt(5);
			random += 10;
			list.add(random);
		}
		int sayac13 = 0;
		int sayac14 = 0;
		for (Integer randList : list) {
			System.out.print(randList + " ");
			if (randList >= 13) {
				sayac13++;
			}
			if (randList >= 14) {
				sayac14++;
			}
		}
		System.out.println("\nToplam 13 sayýsý: " + sayac13);
		System.out.println("Toplam 14 sayýsý: " + sayac14);
	}

	// Klavyeden girilen 5 adet sayýlarýn karelerini alma
	private void algo7() {
		System.out.println("5 tane sayý giriniz");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int sayi = scan.nextInt();
			list.add(sayi * sayi);
		}
		for (Integer kareList : list) {
			System.out.println("Girilen sayýnýn karesi:" + kareList);
		}
	}

	// Klavyeden 3 not girilir. Ýlk notun %30, ikinci notun %30 ve son notun da
	// %40’ýný bulan ve toplamýný ekrana yazdýrma
	private void algo8() {
		System.out.println("1.Vize notunuzu giriniz");
		int vize1 = scan.nextInt();
		System.out.println("2.Vize notunuzu giriniz");
		int vize2 = scan.nextInt();
		System.out.println("Final notunuzu giriniz");
		int vize3 = scan.nextInt();
		System.out.println("Ders notunuz: " + ((vize1 * 3 / 10) + (vize2 * 3 / 10) + (vize3 * 4 / 10)));
	}

	// Klavyeden bir tam sayý okutup klavyeden okunan diðer 10
	// sayýyý çarpma iþlemi
	private void algo9() {
		System.out.println("sayý giriniz:");
		int sayi = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("10 tane sayý giriniz");
		for (int i = 0; i < 10; i++) {
			int carpSayi = scan.nextInt();
			list.add(carpSayi);
		}
		System.out.println("Girilen sayýlar ile çarpýmý:");
		for (Integer CarpimList : list) {
			System.out.println(sayi * CarpimList);
		}
	}

	// Klavyeden girilen 10 sayýdan 5’ten büyük olanlarýn yarýsýný, 5’e eþit ve
	// küçük olan sayýlarýn 2 katýný bulan programý yapýnýz.
	private void algo10() {
		System.out.println("10 tane sayý giriniz");
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(scan.nextDouble());
		}
		for (Double sayiList : list) {
			if (sayiList > 5) {
				System.out.println("Girilen sayýnýn yarýsý: " + sayiList / 2);
			} else {
				System.out.println("Girilen sayýnýn iki katý: " + sayiList * 2);
			}
		}
	}

	// Bir komisyoncu sattýðý mallardan fiyatý 50 TL kadar olanlardan %3,
	// daha fazla olanlardan ise %2 komisyon almaktadýr. Klavyeden girilen 5
	// malýn
	// komisyonlarýný bularak, toplam komisyonu hesaplayýnýz.
	private void algo11() {
		System.out.println("5 tane mal fiyatýný giriniz");
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(scan.nextDouble());
		}
		for (Double malList : list) {
			if (malList < 50) {
				System.out.println("Girilen sayýnýn 3: " + (malList + (malList * 3 / 100)));
			} else {
				System.out.println("Girilen sayýnýn 5: " + (malList + (malList * 5 / 100)));
			}
		}
	}

	// Klavyeden 5 adet yarýçapý verilen çemberlerin alanýný ve çevresini
	// hesaplama
	private void algo12() {
		List<Double> list = new ArrayList<>();
		System.out.println("5 tane yarýçap deðeri giriniz:");
		for (int i = 0; i < 5; i++) {
			double yaricap = scan.nextDouble();
			list.add(yaricap);
		}
		for (Double yaricapList : list) {
			System.out.println("Çemberin çevresi: " + 2 * yaricapList * Math.PI);
			System.out.println("Çemberin alaný: " + yaricapList * yaricapList * Math.PI);
		}
	}

	// Klavyeden girilecek n sayýsý kadar notun en büyük ve en küçük olaný bulma
	private void algo13() {
		List<Integer> list = new ArrayList<>();
		System.out.println("Kaç tane not girmek istiyorsunuz?");
		int nTane = scan.nextInt();
		for (int i = 0; i < nTane; i++) {
			System.out.println((i + 1) + ". sayýyý giriniz");
			list.add(scan.nextInt());
		}
		list.sort(null);
		System.out.println("En küçük not: " + list.get(0));
		System.out.println("En büyük not: " + list.get(nTane - 1));
	}

	// Ýç içe döngüler ile saat: dakika: saniye olarak saat yapýnýz. Saat 0 ile
	// 23, dakika 0 ile 59 ve saniye de 0 ile 59 arasýnda ilerleyecektir.
	private void algo14() {
			for (int i = 0; i < 24; i++) {
				for (int j = 0; j < 60; j++) {
					for (int j2 = 0; j2 < 60; j2++) {
						System.out.println(i + ":" + j + ":" + j2);
					}
				}
			}
		}
	

	// Klavyeden girilen 100’lük sistemdeki 5 notu; 0, 1, 2, 3, 4 ve 5 olacak
	// þekilde ekrana yazan programý yapýnýz.
	private void algo15() {
		System.out.println("Notunuzu giriniz:");
		int not = scan.nextInt();
		if (not < 20 && not >= 0) {
			System.out.println("5'lik sistemde karþýlýðý: 0");
		} else if (not < 40 && not >= 20) {
			System.out.println("5'lik sistemde karþýlýðý: 1");
		} else if (not < 50 && not >= 40) {
			System.out.println("5'lik sistemde karþýlýðý: 2");
		} else if (not < 70 && not >= 50) {
			System.out.println("5'lik sistemde karþýlýðý: 3");
		} else if (not < 80 && not >= 70) {
			System.out.println("5'lik sistemde karþýlýðý: 4");
		} else if (not >= 100 && not >= 80) {
			System.out.println("5'lik sistemde karþýlýðý: 5");
		}
	}

	// Sayýsal olarak girilen bir ay bilgisini ekrana “Ocak, Þubat, Mart veya
	// diðer aylardan biri…” þeklinde yazan programý yapýnýz.
	private void algo16() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Ayýn numarasýný giriniz");
			int ay = scan.nextInt();
			switch (ay) {
			case 1:
				System.out.println("ocak");
				break;
			case 2:
				System.out.println("þubat");
				break;
			case 3:
				System.out.println("mart");
				break;
			case 4:
				System.out.println("nisan");
				break;
			case 5:
				System.out.println("mayýs");
				break;
			case 6:
				System.out.println("haziran");
				break;
			case 7:
				System.out.println("temmuz");
				break;
			case 8:
				System.out.println("aðustos");
				break;
			case 9:
				System.out.println("eylül");
				break;
			case 10:
				System.out.println("ekim");
				break;
			case 11:
				System.out.println("kasým");
				break;
			case 12:
				System.out.println("aralýk");
				break;
			default:
				System.out.println("Hatalý");
				break;
			}
		}
	}

	// Haftanýn günü (Pazartesi, Salý, …) girilince, o günün haftanýn kaçýncý
	// günü olduðunu bulan programý yapýnýz.

	// Fiyat ve KDV oraný ayrý ayrý girilen N malýn toplam fiyatýný
	// hesaplayýnýz.

	// Klavyeden dakika olarak girilen 5 þarkýnýn toplam süresini saat olarak
	// hesaplayan programý yapýnýz.

	// Girilen iþlem türüne (* / - +) göre iki sayýyý iþleme alýp sonucunu
	// ekrana yazan programý yapýnýz. |

	// 1000 000 a kadar olan sayýlarý yazýya çeviren uygulamayý yazýn

	// Rasgele girilen TC Kimlik numarasýnýn dogru olup olmadýgýný bulan metodu
	// yazýn

}
