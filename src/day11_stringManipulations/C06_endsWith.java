package day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {

        /*
        kullanıcıdan mail adresi girmesini isteyin
        -mail @gmail.com içermiyorsa "lutfen gmail adresi giriniz",
        -mail @gmail.com içeriyorsa "Email adresiniz kaydedildi",
        -@gmail.com ile bitmiyorsa "lütfen yazımı kontrol edin" yazdırın
         */
        String input="fatih@gmail.com";

        if (!input.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");

        } else if (input.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("lütfen yazımı kontrol edin");
        }
    }
}
