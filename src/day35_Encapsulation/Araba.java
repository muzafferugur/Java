package day35_Encapsulation;

public class Araba {

    String marka = "Marka Belirtilmedi";
    //marka nın access modifier ı default access modifier
    //olduğundan package içinde kullanılır

    private String model = "Model belirtilmedi";
    private String yakıt="Elektrikli";//tum arabalar elektrikli ise bu variablenin değiştirilmemesi lazım
    //private yaptığımız model ve yakıt variable larına erişimi yetkilendirelim
    //modele değer atanabilsin ama görülmesin(setter)
    //yakıt görülsün ama değer atanamasın isteniyor(getter)
    //bunun için


    public String getYakıt() {
        return yakıt;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
