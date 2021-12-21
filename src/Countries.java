public class Countries {
    public static void main(String[] args) {
        String countries[]= {"BRAZIL", "CHILE", "SYDNEY"};
        int i=0;
        for (String str: countries) {
            if (i < 2) ;
            else break;
            System.out.println(str + ",");
            i++;
        }

    }
}
