import java.util.ArrayList;
import java.util.List;

public class Okul {
    String isim;
    List<Sinif> siniflar;
    List<Ogretmen> ogretmenler;

    Okul(String isim) {
        this.isim = isim;
        siniflar = new ArrayList<>();
        ogretmenler = new ArrayList<>();
    }

    void sinifEkle(Sinif sinif) {
        siniflar.add(sinif);
    }

    void ogretmenEkle(Ogretmen ogretmen) {
        ogretmenler.add(ogretmen);
    }
}
