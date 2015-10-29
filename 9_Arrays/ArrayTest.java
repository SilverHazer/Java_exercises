class ArrayTest {

   public static void main(String[] args) {
      ArrayTest x = new ArrayTest();
      x.doStuff();
   }

   public void doStuff() {

      // creates the array fred of ten integers.
      int[] fred = new int[10];

      // sets the values of the fred array
      for (int i=0; i<10; i++) {
         fred[i] = i;
      }

      // prints the values of the fred array
      for (int i=0; i<10; i++) {
         System.out.println(fred[i]);
      }

      // insert your code for the nums array here:
      double[] num = new double[10];
      double j = 1.0;
      
      for (int i=0; i<10; i++) {
          num[i] = j;
          j += 0.1;
      }
      for (int i=0; i<10; i++) {
         System.out.println(num[i]);
      }
      ArrayPrint.printArray(num);
      
      printArray(num);
   }
   static void printArray(double[] x) {
         for (int i=0; i< x.length; i++) {
         System.out.println(x[i]);
      }
   }
}
