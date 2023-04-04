package day41_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {
        int k;

        try {
            FileInputStream fis=new FileInputStream("src/day41_Exception/Test.txt");

       while ((k=fis.read()) !=-1){
           System.out.print((char) k);
       }



        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı ");

            /*
            IOException-->parent
            FileNotFoundException-->child
            birden fazla bir birine bağlı exception beklediğimizde try-catch yonteminde
            önce child exception sonra parent exception yazılır
            önce parent yazılırsa en kapsayıcı olduğundan child a gerek kalmaz ve
            child ı sonraya yazmak istersek hatalı olur(CTE)

            birbirinden bağımsız exceptionlar beklediğimizde istediğimiz sırayla yazabiliriz

             */

        } catch (IOException e) {
            System.out.println("dosyadan bilgiler okunamadı");
        }
    }
}
