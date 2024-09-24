public class Main {
    public static void main(String[] args) {
        // Öğrenciler
        Ogrenci ogrenci1 = new Ogrenci("Ali", 123);
        Ogrenci ogrenci2 = new Ogrenci("Ayşe", 124);

        // Sınıf
        Sinif sinif1 = new Sinif("10A");
        sinif1.ogrenciEkle(ogrenci1);
        sinif1.ogrenciEkle(ogrenci2);

        // Öğretmenler
        Ogretmen ogretmen1 = new Ogretmen("Ahmet", "Matematik");

        // Okul
        Okul okul = new Okul("ABC Okulu");
        okul.sinifEkle(sinif1);
        okul.ogretmenEkle(ogretmen1);

        System.out.println(ogrenci1);  // Ogrenci: Ali, Numara: 123
        System.out.println(ogrenci2);  // Ogrenci: Ayşe, Numara: 124
        System.out.println(ogretmen1); // Öğretmen: Ahmet, Bölüm: Matematik
        // Burada okul ile ilgili işlemleri yapabilirsiniz
    }
}
