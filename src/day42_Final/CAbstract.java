package day42_Final;

public abstract class CAbstract {
    /*
    bir class ı abstract yapmanın yolu basına abstract yazmaktır.
    bu classlarda variablelerle ilgili konusmayız bu classlar methodlarla ilgilidir
     */
    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();
    abstract void bolme();

    /*
    bir methodun başına abstract yazarsanız
    bu method un child classlar için bir standart olduğunu declare etmiş olursunuz
    ve method bodysine ihtiyaç kalmaz
     */
    void cikarma(){
        System.out.println("Bu method cikarma yapar");
    }

}
