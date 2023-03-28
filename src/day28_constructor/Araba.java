package day28_constructor;

public class Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {

        marka = markaR;
        model = modelR;
        yil = yilR;
        fiyat = fiyatR;
    }

    public Araba(){

    }
    /*
    biz herhangi bir constructor olusturduğumuzda
    java default constructor u siler
    eğer biz projemizde bir sorun yasanmasını istemiyorsak
    mutlaka default constructor yerine parametresiz bir
     parametresiz contructor oluşturmalıyız
     */


    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahiptir.");
    }

    public void maxHız(int hiz) {
        System.out.println("Bu araba max : " + hiz + " km hiz yapar");
    }





}

