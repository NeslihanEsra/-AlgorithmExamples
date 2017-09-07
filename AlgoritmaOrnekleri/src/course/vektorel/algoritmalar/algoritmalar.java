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
	// daha fazla olanlardan ise %2 komisyon almaktad�r. Klavyeden girilen 5
	// mal�n
	// komisyonlar�n� bularak, toplam komisyonu hesaplay�n�z.
	private void algo11() {
		System.out.println("5 tane mal fiyat�n� giriniz");
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(scan.nextDouble());
		}
		for (Double malList : list) {
			if (malList < 50) {
				System.out.println("Girilen say�n�n 3: " + (malList + (malList * 3 / 100)));
			} else {
				System.out.println("Girilen say�n�n 5: " + (malList + (malList * 5 / 100)));
			}
		}
	}

	// Klavyeden 5 adet yar��ap� verilen �emberlerin alan�n� ve �evresini
	// hesaplama
	private void algo12() {
		List<Double> list = new ArrayList<>();
		System.out.println("5 tane yar��ap de�eri giriniz:");
		for (int i = 0; i < 5; i++) {
			double yaricap = scan.nextDouble();
			list.add(yaricap);
		}
		for (Double yaricapList : list) {
			System.out.println("�emberin �evresi: " + 2 * yaricapList * Math.PI);
			System.out.println("�emberin alan�: " + yaricapList * yaricapList * Math.PI);
		}
	}

	// Klavyeden girilecek n say�s� kadar notun en b�y�k ve en k���k olan� bulma
	private void algo13() {
		List<Integer> list = new ArrayList<>();
		System.out.println("Ka� tane not girmek istiyorsunuz?");
		int nTane = scan.nextInt();
		for (int i = 0; i < nTane; i++) {
			System.out.println((i + 1) + ". say�y� giriniz");
			list.add(scan.nextInt());
		}
		list.sort(null);
		System.out.println("En k���k not: " + list.get(0));
		System.out.println("En b�y�k not: " + list.get(nTane - 1));
	}

	// �� i�e d�ng�ler ile saat: dakika: saniye olarak saat yap�n�z. Saat 0 ile
	// 23, dakika 0 ile 59 ve saniye de 0 ile 59 aras�nda ilerleyecektir.
	private void algo14() {
			for (int i = 0; i < 24; i++) {
				for (int j = 0; j < 60; j++) {
					for (int j2 = 0; j2 < 60; j2++) {
						System.out.println(i + ":" + j + ":" + j2);
					}
				}
			}
		}
	

	// Klavyeden girilen 100�l�k sistemdeki 5 notu; 0, 1, 2, 3, 4 ve 5 olacak
	// �ekilde ekrana yazan program� yap�n�z.
	private void algo15() {
		System.out.println("Notunuzu giriniz:");
		int not = scan.nextInt();
		if (not < 20 && not >= 0) {
			System.out.println("5'lik sistemde kar��l���: 0");
		} else if (not < 40 && not >= 20) {
			System.out.println("5'lik sistemde kar��l���: 1");
		} else if (not < 50 && not >= 40) {
			System.out.println("5'lik sistemde kar��l���: 2");
		} else if (not < 70 && not >= 50) {
			System.out.println("5'lik sistemde kar��l���: 3");
		} else if (not < 80 && not >= 70) {
			System.out.println("5'lik sistemde kar��l���: 4");
		} else if (not >= 100 && not >= 80) {
			System.out.println("5'lik sistemde kar��l���: 5");
		}
	}

	// Say�sal olarak girilen bir ay bilgisini ekrana �Ocak, �ubat, Mart veya
	// di�er aylardan biri�� �eklinde yazan program� yap�n�z.
	private void algo16() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Ay�n numaras�n� giriniz");
			int ay = scan.nextInt();
			switch (ay) {
			case 1:
				System.out.println("ocak");
				break;
			case 2:
				System.out.println("�ubat");
				break;
			case 3:
				System.out.println("mart");
				break;
			case 4:
				System.out.println("nisan");
				break;
			case 5:
				System.out.println("may�s");
				break;
			case 6:
				System.out.println("haziran");
				break;
			case 7:
				System.out.println("temmuz");
				break;
			case 8:
				System.out.println("a�ustos");
				break;
			case 9:
				System.out.println("eyl�l");
				break;
			case 10:
				System.out.println("ekim");
				break;
			case 11:
				System.out.println("kas�m");
				break;
			case 12:
				System.out.println("aral�k");
				break;
			default:
				System.out.println("Hatal�");
				break;
			}
		}
	}

	// Haftan�n g�n� (Pazartesi, Sal�, �) girilince, o g�n�n haftan�n ka��nc�
	// g�n� oldu�unu bulan program� yap�n�z.

	// Fiyat ve KDV oran� ayr� ayr� girilen N mal�n toplam fiyat�n�
	// hesaplay�n�z.

	// Klavyeden dakika olarak girilen 5 �ark�n�n toplam s�resini saat olarak
	// hesaplayan program� yap�n�z.

	// Girilen i�lem t�r�ne (* / - +) g�re iki say�y� i�leme al�p sonucunu
	// ekrana yazan program� yap�n�z. |

	// 1000 000 a kadar olan say�lar� yaz�ya �eviren uygulamay� yaz�n

	// Rasgele girilen TC Kimlik numaras�n�n dogru olup olmad�g�n� bulan metodu
	// yaz�n

}
