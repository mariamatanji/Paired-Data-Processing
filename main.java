import java.util.Scanner;

public class PairedDataProcessing {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputKey;
      int furnitureStock;

      inputKey = scnr.next();

      while(!inputKey.equals("Finale")){
        // inputKey = scnr.next();
        furnitureStock= scnr.nextInt();
         if(furnitureStock <= 35){
            System.out.println(inputKey +": reorder soon");
            //inputKey = scnr.next();
            
            }
         inputKey = scnr.next();
         }

   }
}
