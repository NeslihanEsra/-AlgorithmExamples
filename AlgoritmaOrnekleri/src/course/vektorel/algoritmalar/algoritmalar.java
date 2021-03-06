package course.vektorel.algoritmalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class algoritmalar {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		algoritmalar inst = new algoritmalar();
		
		System.out.println("Kullan�c� ad�n�z� giriniz");
		String kAdi = scan.nextLine();
		System.out.println("Kullan�c� �ifrenizi giriniz");
		String kSifre = scan.nextLine();
		
		if (kAdi.equals("ab") && kSifre.equals("ab")) {
			System.out.println("Sadece ilk 10 numaral� algoritmay� kullanabilirsiniz");
			int algoNo = scan.nextInt();
			switch (algoNo) {
			case 1: inst.algo1(); break;
			case 2: inst.algo2(); break;
			case 3: inst.algo3(); break;
			case 4: inst.algo4(); break;
			case 5: inst.algo5(); break;
			case 6: inst.algo6(); break;
			case 7: inst.algo7(); break;
			case 8: inst.algo8(); break;
			case 9: inst.algo9(); break;
			case 10: inst.algo10(); break;
			default: System.out.println("L�ften! 1-10 aras� say� giriniz."); break;
			}
		}
		else if (kAdi.equals("bc") && kSifre.equals("bc")) {
			System.out.println("Sadece aras�ndaki 1 ve 23 aras�ndaki tek say�l� algoritmalar� kullanabilirsiniz");
			int algoNo = scan.nextInt();
			switch (algoNo) {
			case 1: inst.algo1(); break;
			case 3: inst.algo3(); break;
			case 5: inst.algo5(); break;
			case 7: inst.algo7(); break;
			case 9: inst.algo9(); break;
			case 11: inst.algo11(); break;
			case 13: inst.algo13(); break;
			case 15: inst.algo15(); break;
			case 17: inst.algo17(); break;
			case 19: inst.algo19(); break;
			case 21: inst.algo21(); break;
			case 23: inst.algo23(); break;
			default: System.out.println("L�ften! 1-23 aras� tek say� giriniz."); break;
			}
		}
		else if (kAdi.equals("admin") && kSifre.equals("admin")) {
			System.out.println("1-23 aras�ndaki algoritmalar� kullanabilirsiniz");
			int algoNo = scan.nextInt();
			switch (algoNo) {
			case 1: inst.algo1(); break;
			case 2: inst.algo2(); break;
			case 3: inst.algo3(); break;
			case 4: inst.algo4(); break;
			case 5: inst.algo5(); break;
			case 6: inst.algo6(); break;
			case 7: inst.algo7(); break;
			case 8: inst.algo8(); break;
			case 9: inst.algo9(); break;
			case 10: inst.algo10(); break;
			case 11: inst.algo11(); break;
			case 12: inst.algo12(); break;
			case 13: inst.algo13(); break;
			case 14: inst.algo14(); break;
			case 15: inst.algo15(); break;
			case 16: inst.algo16(); break;
			case 17: inst.algo17(); break;
			case 18: inst.algo18(); break;
			case 19: inst.algo19(); break;
			case 20: inst.algo20(); break;
			case 21: inst.algo21(); break;
			case 22: inst.algo22(); break;
			case 23: inst.algo23(); break;
			default: System.out.println("L�ften! 1-23 aras� tek say� giriniz."); break;
			}
		}	
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
		while (true) {
			System.out.println("Ay numaras�n� giriniz:");
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
	private void algo17() {
		while (true) {
			System.out.println("G�n ad�n� yaz�n�z:");
			String[] gunler = { "pazartesi", "sal�", "�ar�amba", "per�embe", "cuma", "cumartesi", "pazar" };
			String gunlerNo = scan.nextLine();
			for (int i = 0; i < gunler.length; i++) {
				if (gunlerNo.equalsIgnoreCase(gunler[i])) {
					System.out.println(i + 1);
				}
			}
		}
	}

	// Fiyat ve KDV oran� ayr� ayr� girilen N mal�n toplam fiyat�n�
	// hesaplay�n�z.
	private void algo18() {
		List<Double> malList = new ArrayList<>();
		List<Double> kdvList = new ArrayList<>();
		System.out.println("Ka� tane mal giri�i yapacaks�n�z?");
		int nTane = scan.nextInt();

		for (int i = 0; i < nTane; i++) {
			System.out.println("Mal�n fiyat�:");
			malList.add(scan.nextDouble());
			System.out.println("KDV'nin fiyat�:");
			kdvList.add(scan.nextDouble());
		}
		int toplamFiyat = 0;
		for (int i = 0; i < nTane; i++) {
			double netFiyat = malList.get(i) + malList.get(i) * kdvList.get(i) / 100;
			System.out.println(netFiyat);
			toplamFiyat += netFiyat;
		}
		System.out.println("Toplam Fiyat" + toplamFiyat);
	}

	// Klavyeden dakika olarak girilen 5 �ark�n�n toplam s�resini saat olarak
	// hesaplayan program� yap�n�z.
	private void algo19() {
		List<Double> sarki = new ArrayList<>();
		double toplamS�re = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("�ark�n�n dakikas�n� giriniz");
			double sarkiS�re = scan.nextDouble();
			toplamS�re += sarkiS�re;
		}
		System.out.println(toplamS�re / 60);
	}

	// Girilen i�lem t�r�ne (* / - +) g�re iki say�y� i�leme al�p sonucunu
	// ekrana yazan program� yap�n�z. |
	private void algo20() {
		System.out.println("Men�den yapmak istedi�iniz karakteri giriniz");

		System.out.println("--- Men� ---");
		System.out.println("+ --> Topla ");
		System.out.println("- --> ��kar");
		System.out.println("* --> �arp");
		System.out.println("/ --> B�l");

		String islem = scan.nextLine();

		System.out.println("Birinci say�y� giriniz");
		int sayi1 = scan.nextInt();
		System.out.println("�kinci say�y� giriniz");
		int sayi2 = scan.nextInt();

		if (islem.equals("+")) {
			System.out.println("Sonu�= " + (sayi1 + sayi2));
		} else if (islem.equals("-")) {
			System.out.println("Sonu�= " + (sayi1 - sayi2));
		} else if (islem.equals("*")) {
			System.out.println("Sonu�= " + (sayi1 * sayi2));
		} else if (islem.equals("/")) {
			System.out.println("Sonu�= " + (double) (sayi1 / sayi2));
		} else {
			System.out.println("Hatal� karakter");
		}
	}

	// 1000 000 a kadar olan say�lar� yaz�ya �eviren uygulamay� yaz�n�z.
	private void algo21() {
		int sayi, birler, onlar, yuzler, binler;
		sayi = Integer.valueOf(JOptionPane.showInputDialog("L�tfen Bir Say� Girin"));

		birler = sayi % 10;
		onlar = (sayi / 10) % 10;
		yuzler = (sayi / 100) % 10;
		binler = (sayi / 1000) % 10;

		String[] birlik = { "", "Bir", "�ki", "��", "D�rt", "Be�", "Alt�", "Yedi", "Sekiz", "Dokuz" };
		String[] onluk = { "", "On", "Yirmi", "Otuz", "K�rk", "Elli", "Altm��", "Yetmi�", "Seksen", "Doksan" };
		String[] yuzluk = { "", "Y�z", "�kiy�z", "��y�z", "D�rty�z", "Be�y�z", "Alt�y�z", "Yediy�z", "Sekizy�z",
				"Dokuzy�z" };
		String[] binlik = { "", "Bin", "�kibin", "��bin", "D�rtbin", "Be�bin", "Alt�bin", "Yedibin", "Sekizbin",
				"Dokuzbin" };

		System.out.println(binlik[binler] + "  " + yuzluk[yuzler] + " " + onluk[onlar] + " " + birlik[birler]);
	}

	// Rasgele girilen TC Kimlik numaras�n�n dogru olup olmad�g�n� bulan metodu
	// yaz�n
	private void algo22() {
		System.out.println("T.C kimlik numaran�z� giriniz:");
		String tc = scan.nextLine();

		if (tc.length() != 11) {
			System.out.println("11 haneli T.c numar�n�z� giriniz.");
		} else {
			int bir = Integer.valueOf(tc.charAt(0));
			int iki = Integer.valueOf(tc.charAt(1));
			int uc = Integer.valueOf(tc.charAt(2));
			int dort = Integer.valueOf(tc.charAt(3));
			int bes = Integer.valueOf(tc.charAt(4));
			int alti = Integer.valueOf(tc.charAt(5));
			int yedi = Integer.valueOf(tc.charAt(6));
			int sekiz = Integer.valueOf(tc.charAt(7));
			int dokuz = Integer.valueOf(tc.charAt(8));
			int on = Integer.valueOf(tc.charAt(9));
			int onbir = Integer.valueOf(tc.charAt(10));

			int kosul1, kosul2;
			kosul1 = ((bir + uc + bes + yedi) * 7 - (iki + dort + alti + sekiz)) % 10;
			kosul2 = (bir + uc + bes + yedi + iki + dort + alti + sekiz) % 10;

			if (bir == 0) {
				System.out.println("Kimlik numaras� 0 ile ba�lamaz");
			} else if (kosul1 == on && kosul2 == onbir) {
				System.out.println("Kimlik ge�erlidir.");
			} else {
				System.out.println("Kimlik ge�erli de�ildir!");
			}
		}
	}

	private void algo23() {
		System.out.println("1.Kenar� giriniz");
		int k1 = scan.nextInt();
		System.out.println("2.Kenar�� giriniz");
		int k2 = scan.nextInt();
		System.out.println("3.Kenar� giriniz");
		int k3 = scan.nextInt();

		if ((k2 + k3) > k1 && (k2 - k3) < k1 || (k1 + k3) > k2 && (k1 - k3) < k3 || (k1 + k2) > k3 && (k1 - k2) < k3) {
			System.out.println("Bu ��gen çizilebilir.");
			if (k1 == k2 && k1 == k3 && k2 == k3) {
				System.out.println("Bu ��gen e�kenard�r.");
			} else if (k1 == k2 || k1 == k3 && k2 == k3) {
				System.out.println("Bu ��gen ikizkenard�r.");
			} else if (k1 != k2 && k1 != k3 && k2 != k3) {
				System.out.println("Bu ��gen �e�itkenard�r.");
			}

			int uCevre = k1 + k2 + k3;
			System.out.println("��genin �evresi: " + uCevre);
			System.out.println("��genin alan�: " + ((uCevre - k1) * (uCevre - k2) * (uCevre - k3) * 1 / 2));
		} else {
			System.out.println("Bu ��gen çizilemez.");
		}
	}
}
