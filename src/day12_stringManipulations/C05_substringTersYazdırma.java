package day12_stringManipulations;

public class C05_substringTersYazdırma {
    public static void main(String[] args) {

        //kullanıcıdan 4 harfli bir kelime alın ve tersten yazdırın

        String input="veli";

        String tersInput=input.substring(3)+input.substring(2,3)+
                input.substring(1,2)+input.substring(0,1);

        System.out.println(tersInput);
    }
}
