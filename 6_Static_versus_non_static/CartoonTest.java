class FredFlintstone {

   // Properties of the class...
   static String name            = "Fred Flintstone";
   static String favouriteColour = "blue";
   static int    favouriteNumber = 42;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class WilmaFlintstone {

   // Properties of the class...
   static String name            = "Wilma Flintstone";
   static String favouriteColour = "red";
   static int    favouriteNumber = 63;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class BarneyRubble {

   // Properties of the class...
   static String name            = "Barney Rubble";
   static String favouriteColour = "yellow";
   static int    favouriteNumber = 2;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class CartoonTest { 

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      CartoonCharacter Fred = new CartoonCharacter(FredFlintstone.name,FredFlintstone.favouriteColour,FredFlintstone.favouriteNumber);
      CartoonCharacter Wilma = new CartoonCharacter(WilmaFlintstone.name,WilmaFlintstone.favouriteColour,WilmaFlintstone.favouriteNumber);
      CartoonCharacter Barney = new CartoonCharacter(BarneyRubble.name,BarneyRubble.favouriteColour,BarneyRubble.favouriteNumber);
      
      Fred.displayMe();
      Wilma.displayMe();
      Barney.displayMe();
      
      System.out.println(Barney.favouriteColour);
      System.out.println(CartoonCharacter.count);
      
      System.out.println(Math.PI);
   }
}

