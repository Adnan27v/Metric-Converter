import java.util.Scanner;

public class metricConverter {

   public static float converter(String fromMetric, String toMetric, float fromNum) {
      float toNum = 0;
      switch (fromMetric) {
         case "kg":
            switch (toMetric) {
               case "g":
                  toNum = fromNum * 1000;
                  break;
               case "lbs":
                  toNum = fromNum * (float) 2.205;
                  break;
               case "oz":
                  toNum = fromNum * (float) 35.274;
                  break;
               default:
                  System.out.printf("Please input the value in a valid format,like, 1 kg = g\n");

            }
            break;
         case "km":
            switch (toMetric) {
               case "m":
                  toNum = fromNum * 1000;
                  break;
               case "mile":
                  toNum = fromNum * (float) 0.621371;
                  break;
               case "in":
                  toNum = fromNum * (float) 39370.1;
                  break;
               case "ft":
                  toNum = fromNum * (float) 3280.841666667;
                  break;
               case "yd":
                  toNum = fromNum * (float) 1093.61;
                  break;
               default:
                  System.out.printf("Please input the value in a valid format,like, 1 km = m\n");

            }
            break;
         case "g":
            switch (toMetric) {
               case "kg":
                  toNum = fromNum / (float) 1000;
                  break;
               case "oz":
                  toNum = fromNum * (float) 0.035274;
                  break;
               case "lbs":
                  toNum = fromNum * (float) 0.0022046249999752;
                  break;
               default:
                  //System.out.printf("Please input the value in a valid format,like, 1 g = kg\n");
            }
         default:
            System.out.println("Please input the value in a valid format,like, 1 kg = g");
      }
      System.out.printf("%.3f %s = %.3f %s\n", fromNum, fromMetric, toNum, toMetric);
      return toNum;
   }

   public static void main(String[] args) throws Exception {
      System.out.printf(
            "\nWelcome to Metric Converter!\nPlease input your Metric to be converted,i.e,1 kg = g\nType 'exit' to quit the program\n");
      String toMetric;
      String fromMetric;
      float fromNum;
      Scanner scnr = new Scanner(System.in);

      while (true) {
         System.out.printf("\nPlease enter a unit to convert:");
         String str = scnr.nextLine();

         if (str.equals("exit")) {
            System.out.printf("\nThank you for Using Metric Converter!\n\n");
            break;
         }
         String[] strArray;
         strArray = str.split(" ");

         if (strArray.length != 4) {
            System.out.println("Please input the value in a valid format,like, 1 kg = g");
            continue;
         } else {
            fromNum = Float.parseFloat(strArray[0]);
            fromMetric = strArray[1];
            toMetric = strArray[3];

            converter(fromMetric, toMetric, fromNum);
         }
      }
      scnr.close();
   }
}
