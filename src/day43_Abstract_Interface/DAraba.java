package day43_Abstract_Interface;

public abstract class DAraba {
    public static void main(String[] args) {


    /*
    abstract class da main method opsiyoneldir.
    Eğer abstract class sadece child classların
    tasımak zorunda olduğu ozellikleri tasımak için olusturulduysa
    main methoda ihtiyac olmaz
    sadece abstract methodlar olur

    ama bir abstract methodda
    standart belirlemek dısında da methodlar calısabilir
    bu durumda ihtiyac olursa main method olusturulabilir
     */
}

    protected abstract void yakit();

    protected abstract void kaporta();
protected abstract void motor();
    /*
    Sadece child classların mecburi tasıyacakları özellikleri belirleyen
    methodlar abstract method olur ve abstract methodların bodysi olmaz

     */

    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir.");
         /*
        abstract olmayan method'lara concrete method denir.
        abstract bir method'u abstract keyword ile belirtmek ZORUNLUDUR.

        concrete method'larda bunun declare edilmesine gerek yoktur.
        biz sadece abstraction ile ilgili konustugumuzda abstract olmayan
        method'lardan bahsetmek icin concrete tabirini kullaniriz.
         */

    }

}
