package day11_stringManipulations;

public class C01_IndexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";


        /*
        verilen bir string de herhangi bir string veya char in
        ilk kullanıldığı indexi bize getirir.

         */
        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g'));// 6
        System.out.println(str.indexOf("t"));//-1

        System.out.println(str.indexOf("mek"));//10

        //eğer istediğimiz index ten sonrasını kontrol etmek istersek
        //o zaman aynı methodu iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g", (6+1)));//yazılan indexten baslar
        //yukarıdaki str da 2. ve 3.e nin indexlerini bulun
        //2. e yi bulabilmek için 1.e nin indexine ihtiyacım var

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e", ilke+1);

        if (ikincie==-1){
            System.out.println("verilen str da 2.e yok");
        }else {
            int ucuncue=str.indexOf("e", ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str da 3.e yok");
            }else {
                System.out.println("verilen strdaki 3.e nin indexi :"+ucuncue);
            }
        }

    }
}
