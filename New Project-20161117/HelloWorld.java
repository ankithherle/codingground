import java.util.*;

public class HelloWorld{

//
     public static void main(String []args){
        List<String> a1 = new ArrayList<String>();
        a1.add("A");
        a1.add("B");
        // String str = Arrays.toString(a1.toArray());
        String str = String.join(",", a1);

        Map<String, String> m1 = new HashMap<String, String>();
        // m1.put(str, "AA");
        // System.out.println(m1);
        String[] parts = str.split(",");
        System.out.println(parts[parts.length -2]);
     }
}
