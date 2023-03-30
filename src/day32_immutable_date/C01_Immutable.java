package day32_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Kenan");
        list.add("Enes");
        list.add("Ismail");

        System.out.println(list);//[Kenan, Enes, Ismail]
        list.set(1, "Yasemin");

        list.remove("Ismail");
        System.out.println(list); // [Kenan, Yasemin]

    }


}
