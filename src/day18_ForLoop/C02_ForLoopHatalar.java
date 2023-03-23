package day18_ForLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        //baslangıç noktasından sonra
        //bitis sartına yaklasmıyorsak sonsuz loop oluşur

        /*
        for (int i = 0; i >-10; i++) {
            System.out.println(i);
*/

        //eğer ilk değer için bile bitis sartı sağlanmıyorsa
        //for loop calısır
        //ama loop bodysi hiç bir zaman devreye girmez(calısmaz)

        for (int i = 0; i > 5; i++) {
            System.out.println(i);

        }
        }
    }

