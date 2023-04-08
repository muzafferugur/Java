package day48_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReusableMethods {
    public static Map<Integer,String> mapOlustur(){

        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Tester");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");

        return sinifMap;
    }

    public static void tumValueSıraliYazdır(Map<Integer, String> ogrenciMap) {

        int sira=1;
        for (String each: ogrenciMap.values()
             ) {
            System.out.println(sira + " " + each);
            sira++;

        }
    }

    public static List<String> isimSoyisimListesiOluştur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList = new ArrayList<String>();
        String[] eachArr;
        for (String each: ogrenciMap.values()
             ) {
                eachArr=each.split(", ");
                methoddakiList.add(eachArr[0]+" "+eachArr[1]);
        }
    return methoddakiList;
    }

    public static void tumValueSiraaliYazdir(Map<Integer, String> sinifListMap) {
    }

    public static void bransOgrencisoyisiYazdir(Map<Integer, String> sinifListMap) {
    }
}
