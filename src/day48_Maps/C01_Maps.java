package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");
        System.out.println(sinifList);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

    }
}
