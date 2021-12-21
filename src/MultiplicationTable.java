public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("        Multiplication Table        ");
        System.out.println("            ");
        for (int i =1; i<=9; i++){
            System.out.print("   " +i );
        }
        System.out.println("\n--------------------------------------------" );
        for (int j=1; j<=9; j++){
          System.out.println(j + " |");

            for (int i =1; i<=9; i++ ){
                System.out.printf("%4d", i * j );
            }
            System.out.println();

        }



    }
}

/* Multiplication Table

       1 2 3 4 5 6 7 8 9
      -----------------------
 1|
 2
 3
 4
 5
 6
 7
 8
 9

 */
