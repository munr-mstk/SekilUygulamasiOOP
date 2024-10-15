package tr.com.turksat.saop.sekiller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sekil seciliSekil = null;
        char sembol = '*';

        while (true) {
            System.out.println();
            System.out.println("Seçenekler:");
            System.out.println();
            System.out.println("1: Küçük Kare çiz");
            System.out.println("2: İstediğin boyutta kare çiz");
            System.out.println("3: Dikdörtgen çiz");
            System.out.println("4: Üçgen çiz");
            System.out.println("5: Daire çiz");
            System.out.println("6: Yıldız çiz");
            System.out.println("7: Sembol değiştir");
            System.out.println("8: Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim) {
                case 1:
                    seciliSekil = new Kare(3, sembol);
                    seciliSekil.ciz();
                    break;
                case 2:
                    System.out.print("Kare boyutunu girin: ");
                    int kareBoyut = scanner.nextInt();
                    seciliSekil = new Kare(kareBoyut, sembol);
                    seciliSekil.ciz();
                    break;
                case 3:
                    System.out.print("Dikdörtgen genişliğini girin: ");
                    int genislik = scanner.nextInt();
                    System.out.print("Dikdörtgen yüksekliğini girin: ");
                    int yukseklik = scanner.nextInt();
                    seciliSekil = new Dikdortgen(genislik, yukseklik, sembol);
                    seciliSekil.ciz();
                    break;
                case 4:
                    System.out.print("Üçgen yüksekliğini girin: ");
                    int ucgenYukseklik = scanner.nextInt();
                    seciliSekil = new Ucgen(ucgenYukseklik, sembol);
                    seciliSekil.ciz();
                    break;
                case 5:
                    System.out.print("Daire çapını girin: ");
                    int cap = scanner.nextInt();
                    seciliSekil = new Daire(cap, sembol);
                    seciliSekil.ciz();
                    break;
                case 6:
                    System.out.print("Yıldız boyutunu girin: ");
                    int yildizBoyut = scanner.nextInt();
                    seciliSekil = new Yildiz(yildizBoyut, sembol);
                    seciliSekil.ciz();
                    break;
                case 7:
                    System.out.print("Yeni sembolü girin: ");
                    sembol = scanner.next().charAt(0);
                    if (seciliSekil != null) {
                        seciliSekil.sembolDegistir(sembol);
                        seciliSekil.ciz();
                    }
                    break;
                case 8:
                    System.out.println("Programdan kapatılıyor ...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
