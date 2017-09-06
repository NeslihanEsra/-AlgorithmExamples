package course.vektorel.algoritmalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class algoritmalar {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		algoritmalar inst = new algoritmalar();
		inst.algo11();
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
	// daha fazla olanlardan ise %2 komisyon almaktadýr. Klavyeden girilen 5 malýn
	// komisyonlarýný bularak, toplam komisyonu hesaplayýnýz.
	private void algo11() {
		System.out.println("5 tane mal fiyatýný giriniz");
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(scan.nextDouble());
		}
		for (Double malList : list) {
			if (malList < 50) {
				System.out.println("Girilen sayýnýn 3: " + (malList+(malList * 3/100)));
			} else {
				System.out.println("Girilen sayýnýn 5: " + (malList + (malList* 5/100)));
			}
		}
	}
}
