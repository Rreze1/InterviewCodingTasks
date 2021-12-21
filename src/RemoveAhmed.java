import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                List<String> names2 = new ArrayList<>();

        names.forEach(p-> {if(p.equals("Ahmed")) names2.add(p);}  );
         names.removeAll(names2);

        System.out.println(names2);
        System.out.println(names);
    }
