package day35_Encapsulation;

public class Ogretmen {
    private String isim;
    private String soyisim;
    private String brans;
    /*
      bazende yetkileri sınırlamak değil de
      yapılan işi daha iyi tanımlamak için
      encapsulation kullanılır

      bunun için bu yaklaşımı kullanan classlar da
      tum variableler private yapılır ve
      hepsi için getter ve setter yapılır

     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
