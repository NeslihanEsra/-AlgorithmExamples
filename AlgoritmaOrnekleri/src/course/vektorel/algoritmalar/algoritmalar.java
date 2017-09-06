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

	// Klavyeden girilen n adet notun ortalamas�
	private void algo1() {
		System.out.println("Ka� tane not gireceksiniz?");
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
		System.out.println("Say�lar�n Ortalamas�: " + (toplam / nTane));

	}

	// Klavyeden girilen n adet notun en b�y�k ve en k�����n� bulma
	private void algo2() {
		System.out.println("Ka� tane say� gireceksiniz?");
		int nTane = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nTane; i++) {
			System.out.println("Say� giriniz:");
			list.add(scan.nextInt());
		}
		list.sort(null); // default olarak say�lar k���kten b�y��e s�ralan�r
		System.out.println("En k���k sayi: " + list.get(0)); // listen bir dizi
																// �a��r�l�r
		System.out.println("En b�y�k sayi: " + list.get(nTane - 1));
	}

	// Klavyeden girilen 5 adet say�n�n 10dan b�y�k olanlar�n� sayma
	private void algo3() {
		System.out.println("-5 tane say� girmelisiniz-");
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". say�n�z� giriniz:");
			list.add(scan.nextInt());
		}
		int sayac10 = 0;
		for (Integer sayiList : list) {
			if (sayiList > 10) {
				sayac10++;
			}
		}
		System.out.println("10'dan b�y�k olan toplam " + sayac10 + " tane say� vard�r.");
	}

	// Klavyeden 0 say�s� girilene kadar say�lar okutup
	// Girilen say�lar�n 2 kat�n� alarak ekrana yazd�rma
	private void algo4() {
		List<Integer> list = new ArrayList<>();
		int sayi = 1;
		while (sayi != 0) {
			System.out.println("Say� giriniz:");
			sayi = scan.nextInt();
			if (sayi != 0) {
				list.add(sayi);
			}
		}
		for (Integer carpimList : list) {
			System.out.println("Girilen say�lar�n 2 kat�: " + carpimList * 2);
		}
	}

	// 30 ki�ilik s�n�fta (Random 10 ile 15 aral���nda ), ya�� 13 ile 15
	// aras�nda olanlar�n say�s�n� bulma
	private void algo5() {
		Random rand = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			int random = rand.nextInt(5);
			random += 10; // random say�n�n 10-15 aras�nda olmas� i�in bu i�lem
							// uygulan�r
			list.add(random);
		}
		System.out.println("Rastgele �retilen say�lar:" + list);
		int sayac = 0;
		for (Integer sayiList : list) {
			if (sayiList >= 13 && sayiList <= 15) {
				sayac++;
			}
		}
		System.out.println("13 ile 15 aras�ndaki toplam say�: " + sayac);
	}

	// 30 ki�ilik s�n�fta (Random 10 ile 15 aral���nda ) ya�� 13, 14
	// olanlar�n say�s�n� ayr� ayr� bulma
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
		System.out.println("\nToplam 13 say�s�: " + sayac13);
		System.out.println("Toplam 14 say�s�: " + sayac14);
	}

	// Klavyeden girilen 5 adet say�lar�n karelerini alma
	private void algo7() {
		System.out.println("5 tane say� giriniz");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int sayi = scan.nextInt();
			list.add(sayi * sayi);
		}
		for (Integer kareList : list) {
			System.out.println("Girilen say�n�n karesi:" + kareList);
		}
	}

	// Klavyeden 3 not girilir. �lk notun %30, ikinci notun %30 ve son notun da
	// %40��n� bulan ve toplam�n� ekrana yazd�rma
	private void algo8() {
		System.out.println("1.Vize notunuzu giriniz");
		int vize1 = scan.nextInt();
		System.out.println("2.Vize notunuzu giriniz");
		int vize2 = scan.nextInt();
		System.out.println("Final notunuzu giriniz");
		int vize3 = scan.nextInt();
		System.out.println("Ders notunuz: " + ((vize1 * 3 / 10) + (vize2 * 3 / 10) + (vize3 * 4 / 10)));
	}

	// Klavyeden bir tam say� okutup klavyeden okunan di�er 10
	// say�y� �arpma i�lemi
	private void algo9() {
		System.out.println("say� giriniz:");
		int sayi = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("10 tane say� giriniz");
		for (int i = 0; i < 10; i++) {
			int carpSayi = scan.nextInt();
			list.add(carpSayi);
		}
		System.out.println("Girilen say�lar ile �arp�m�:");
		for (Integer CarpimList : list) {
			System.out.println(sayi * CarpimList);
		}
	}

	// Klavyeden girilen 10 say�dan 5�ten b�y�k olanlar�n yar�s�n�, 5�e e�it ve
	// k���k olan say�lar�n 2 kat�n� bulan program� yap�n�z.
	private void algo10() {
		System.out.println("10 tane say� giriniz");
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(scan.nextDouble());
		}
		for (Double sayiList : list) {
			if (sayiList > 5) {
				System.out.println("Girilen say�n�n yar�s�: " + sayiList / 2);
			} else {
				System.out.println("Girilen say�n�n iki kat�: " + sayiList * 2);
			}
		}
	}

	// Bir komisyoncu satt��� mallardan fiyat� 50 TL kadar olanlardan %3,
	// daha fazla olanlardan ise %2 komisyon almaktad�r. Klavyeden girilen 5 mal�n
	// komisyonlar�n� bularak, toplam komisyonu hesaplay�n�z.
	private void algo11() {
		System.out.println("5 tane mal fiyat�n� giriniz");
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(scan.nextDouble());
		}
		for (Double malList : list) {
			if (malList < 50) {
				System.out.println("Girilen say�n�n 3: " + (malList+(malList * 3/100)));
			} else {
				System.out.println("Girilen say�n�n 5: " + (malList + (malList* 5/100)));
			}
		}
	}
}
