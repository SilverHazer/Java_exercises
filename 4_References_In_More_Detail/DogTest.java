class Flea {
   
   // Properties of the class...
   private String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   private String name;
   private int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   public String toString() {
      return "\nname: " + name + "\nage: " + age + "\nflea: " + dogsFlea;
   }

}

class DogOwner {

   // Properties of the class...
   private String name;
   private int    salary;
   public Dog    ownersDog;

   // Constructor of the class...
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name      = aName;
      salary    = aSalary;
      ownersDog = aDog;
   }
   public String toString() {
      return "name: " + name + "\nsalary: " + salary + "\ndog: " + ownersDog;
   }
   
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea Pop = new Flea("Pop");
      Flea Squeak = new Flea("Squeak");
      Flea Zip = new Flea("Zip");
      
      Dog Rex = new Dog("Rex",4,Pop);
      Dog Jimbo = new Dog("Jimbo",6,Squeak);
      Dog Fido = new Dog("Fido",12,Zip);
      
      DogOwner Angus = new DogOwner("Angus", 30000, Rex);
      DogOwner Brian = new DogOwner("Brian", 20000, Jimbo);
      DogOwner Charles = new DogOwner("Charles", 300, Fido);
      
      System.out.println(Angus.toString() + "\n");
      System.out.println(Brian.toString() + "\n");
      System.out.println(Charles.toString() + "\n");
      
      System.out.println(Angus.ownersDog.dogsFlea.toString());
      
   }
}

