public class Ogrenci {
    private String isim;
    private int numara;

    public Ogrenci(String isim, int numara) {
        this.isim = isim;
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Ogrenci: " + isim + ", Numara: " + numara;
    }
}
