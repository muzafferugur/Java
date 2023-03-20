package day13_RECAP;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi girin");

        String jobTitle=scan.nextLine().toLowerCase();

        if (jobTitle.contains("qa")){
            System.out.println("Quality Analyst");
        } else if (jobTitle.contains("dev") || jobTitle.contains("DEV") ) {
            System.out.println("Developer");

        } else if (jobTitle.contains("ba")||jobTitle.contains("BA")) {
            System.out.println("Business Analyst");

        } else if (jobTitle.contains("pm")||jobTitle.contains("PM")) {
            System.out.println("Project Maneger");

        }else {
            System.out.println("gecerli bir test data giriniz");
        }
    }
}
