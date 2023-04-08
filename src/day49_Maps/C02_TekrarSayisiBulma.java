package day49_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

         /*
        Verilen bir String'deki kullanilan harfleri ve kullanilan harflerin
        tekrar sayisini
        H = 20 seklinde yazdirin.
         */

        String str = "Heeeeellllooooo Woooorrrrllllllddddd";
        // --> space'leri saymamasi icin once onlari yok edelim.
        str=str.replaceAll("\\W","");
        String[] harflerArr=str.split("");

        System.out.println(Arrays.toString(harflerArr));
        /*
         [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
         --> Harfleri key, kullanim adedini value yaparak bir map olusturalim
         */

        Map<String,Integer> harfKullanimsayilariMap=new HashMap<>();
        Integer harfKullanimsayisi;
        for (String each:harflerArr
             ) {

            if (!harfKullanimsayilariMap.containsKey(each)){
                harfKullanimsayilariMap.put(each,1);
            }else{
                harfKullanimsayisi=harfKullanimsayilariMap.get(each);
                harfKullanimsayilariMap.put(each, ++harfKullanimsayisi);
            }



        }

            System.out.println(harfKullanimsayilariMap);//{r=4, d=5, e=5, W=1, H=1, l=10, o=9}
    }
}
