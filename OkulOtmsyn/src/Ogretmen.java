public class Ogretmen {
    private String isim;
    private String bolum;

    public Ogretmen(String isim, String bolum) {
        this.isim = isim;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Öğretmen: " + isim + ", Bölüm: " + bolum;
    }
}

