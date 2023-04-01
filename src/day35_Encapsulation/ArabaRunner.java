package day35_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable'ına
        //ulasabıldım,değiştirebildim(set) ve yazdırabildim(get).
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variab'ına ulasımı
        //tamamen serbest yapabilir veya tamamen engelleyebilirim
        //private yaptığımız modele ise hiç ulasamayız
        //yani access modifier ya hep ya hiç diyor

        //modeli değiştirelim ama göremeyelim
        //yakıtı görelim ama değiştiremeyelim

        //set ve get yetkilerini özel olarak tanımlamak isterseniz
        //1.adım:özel yetki tanımlayacağınız variableleri private olarak ttanımlayın
        //           private bir dataya baska class lardan ulaşmak mümkün olmadığından
        //2. adim : set yetkisi icin setter, get yetkisi icin getter method'lari olusturalim

        arb1.setModel("Corolla");//model olarak suprayı atadık
        //modeli yazdırma imkanımız yok çünkü getter yok
        System.out.println(arb1.getYakıt());//yakıt olarak elektrikli bilgisini yazdırabildik
        //yakıtı değiştiremeyiz cunku setter methodu yok

    }
}
