public class Iffy {
   private int anIntProp = 55;
   public static void main(String[] args) {
      Iffy me = new Iffy();
      me.callSomeMethods();
   }

   public void callSomeMethods() {
      // add statements here to exercise the other methods ...
      // the braces for the if statement are missing while if is ended with a semi-colon
      warnIfNegative(-1);
      warnIfNegative(1);
      
      // braces at the if statement weren't set so only the first sentence was excecuted
      // inside the if statement, the second was always excecuted.
      resetIfNegative();
      System.out.println(anIntProp);
      
      System.out.println(isInRange(5, 10, 3) + " <---should be true");
      System.out.println(isInRange(11, 10, 3) + " <---should be false");
      System.out.println(isInRange(10, 11));

    //  System.out.println(isInRangeIfLess(5, 10, 3));
    //  System.out.println(isInRangeIfLess(11, 10, 3));
   }

   /**
    * Print out a warning if the value is negative
    * otherwise don't do anything.
    */
   public void warnIfNegative(int theValue) {
      if(theValue < 0) {
          System.out.println("Caution - negative value given (" + theValue + ")");
      }
   }
  
   /**
    * Print out a warning if the value of anIntProp is negative
    * and also set the value to zero.
    * Otherwise don't do anything.
    */
   public void resetIfNegative() {
      if(anIntProp < 0) {
         System.out.println("Caution - negative value given (" + anIntProp + ")");
         anIntProp = 0;
      }
   }

   /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */
    public boolean isInRange(int value, int upperBound, int lowerBound) {
     if(lowerBound <= value && value <= upperBound )
       return true;

     else
       return false;
     }
     
     public String isInRange(int upperBound, int lowerBound) {
        if(upperBound <= lowerBound) {
            return "Upper bound is equal or less than lower bound";
        }
        else {
            return " ";
        }
     }
     
   /*  public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
     switch(value) {
        case(value < lowerBound && value > upperBound):
            return false;
            break;
        case(value > lowerBound && value < upperBound):
            return true;
            break;
     }*/
     
   //}
}
