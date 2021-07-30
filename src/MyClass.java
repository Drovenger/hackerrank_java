import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<String> modelList = new ArrayList<>();
//        modelList.add("S-Works Stumpjumper 120 FSR");
//        modelList.add("S-Works Tarmac E5 Dura-Ace");
//        modelList.add("S-Works Tarmac E5 Record");
//        modelList.add("sbdajsbdkasjdka");
        String replace = modelList.toString().replace("[", "('").replace("]", "')").replace(",", "','");
        System.out.println(modelList);
        System.out.println(replace);
        ádnajsnfkjdfksdf
    }
}
