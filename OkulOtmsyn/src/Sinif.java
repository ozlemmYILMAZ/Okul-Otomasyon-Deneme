import java.util.ArrayList;
import java.util.List;

public class Sinif {
    String isim;
    List<Ogrenci> ogrenciler;

    Sinif(String isim) {
        this.isim = isim;
        ogrenciler = new ArrayList<>();
    }

    void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
    }
}

