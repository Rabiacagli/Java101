import java.util.Scanner;
public class SinifGecmeSistemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");   // 0-100 arası
        int matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");   // 0-100 arası
        int fizik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");   // 0-100 arası
        int turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");   // 0-100 arası
        int kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");   // 0-100 arası
        int muzik = input.nextInt();
        System.out.println("İngilizce notunuzu giriniz: ");   // 0-100 arası
        int ingilizce = input.nextInt();
        System.out.println("Beden Eğitimi notunuzu giriniz: ");   // 0-100 arası
        int bedenEgitimi = input.nextInt();
        System.out.println("Almanca notunuzu giriniz: ");   // 0-100 arası
        int Almanca = input.nextInt();
        System.out.println("Biyoloji notunuzu giriniz: ");   // 0-100 arası
        int biyoloji = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");   // 0-100 arası
        int tarih = input.nextInt();
        var toplam = turkce + matematik + ingilizce + fizik + kimya + muzik + bedenEgitimi + Almanca + biyoloji + tarih;
        double ortalama = toplam / 10.0;
        System.out.println("Ortalama: " + ortalama);
        if (ortalama >= 60) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");

        }
    }
}


                                                                /*Author: Mert PEHLIVAN
                                                                 * Date: 17.10.2023 Tuesday
                                                                 * IDE: intellij idea
                                                                 */


