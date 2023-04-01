package day35_Encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());
        /*
        bu yöntemle dataHiding değil daha anlaşılır kod amaçlanmış olur
         */
    }
}
