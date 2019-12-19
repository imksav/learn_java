public class StringKoKamaal{
    public static void main(String[] args){
        String str1 = "I'm Ksav.";
        String str2 = "i'm Ksav.";

        // First program
        // Display message as below to make output clear
        System.out.println("(String str1 = I'm Ksav.)");
        System.out.println("(String str2 = i'm Ksav.)");

        // (str1.equals(str2)) check either they are totally equal or not.
        if(str1.equals(str2)){
            System.out.println("They are equal.\n\n");
        }
        else{
            System.out.println("They are not equal.\n\n");
        }
        // Second program
        // Display message as below to make output clear
        System.out.println("(String str1 = I'm Ksav.)");
        System.out.println("(String str2 = i'm Ksav.)");
        // (str1.equalsIgnoreCase(str2)) ignore the case either upper or lower.
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("They are equal.\n\n");
    }
    else{
         System.out.println("They are not equal.\n\n");
        }


        // Remember during counting initial is always zero
        // Third program
        // Display message as below to make output clear
        System.out.println("Remember during counting initial is always zero");
        System.out.println("I'm Ksav.");

        // Third program Part one
        System.out.println("(str1.charAt(4)) helps to select a place at that position.");
        // (str1.charAt(4)) helps to select a place at that position
        System.out.println(str1.charAt(4));

        // Third program Part two
        System.out.println("(str1.charAt(4)) helps to find the index of that word i.e. where the word is placed.");
        // (str1.charAt(4)) helps to find the index of that word i.e. where the word is placed.
        System.out.println(str1.indexOf("Ksav"));

        // Third program Part three
        System.out.println("(str1.substring(4,9) helps to print the data from the starting point to ending point)exclusive).");
        // (str1.substring(4,9) helps to print the data from the starting point to ending point)exclusive). 
        System.out.println(str1.substring(4,9));
      
    }
}