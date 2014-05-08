// ************************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ************************************************


public class Lab2point3E
{
   public static void main (String[] args)
   {
      int base;        // the new base
      int base10Num;   // the number in base 10
      double maxNumber;   // the maximum number that will fit
                       // in 4 digits in the new base

      int place0;      // digit in the 1's (base^0) place
      int place1;      // digit in the base^1 place
      int place2;      // digit in the base^2 place
      int place3;      // digit in the base^3 place
      
      int divPlace0;
      int divPlace1;
      int divPlace2;
      int divPlace3;

      String baseBNum = new String (""); // the number in the new base

      // read in the base 10 number and the base
      base = GetInfo.getSlider("Please enter a base (2 - 9): ",2,9);
      maxNumber = Math.pow(base, 4)-1;
      base10Num = GetInfo.getSlider("Please enter a base 10 number to convert less than " + maxNumber + " :", 0, (int)maxNumber);
      
      place0 = base10Num % base;
      divPlace0 = base10Num / base;
      
      place1 = divPlace0 % base;
      divPlace1 = divPlace0 / base; 
      
      place2 = divPlace1 % base;
      divPlace2 = divPlace1 / base; 	
     
      place3 = divPlace2 % base;
      divPlace3 = divPlace1 / base;
      
      GetInfo.showMessage("Your number in base 10 is: " + base10Num + "\nYour base 10 number in base " + base + " is: " + place3 + place2 + place1 + place0); 	
    	
    }
}
       
