public class BRTest {
    private int calls;
    private int succesfullCalls;
    private int totalReturned;
    private int[] excepCounts = new int[5];
    
    public void callIt() {
        calls++;
        try {
            int x = BadRandom.randVal();
            succesfullCalls++;
            totalReturned += x;
            
        }
        catch (ClassCastException e) {
            System.out.println("Wrong class casting! ");
            excepCounts[0]++;
        }
        catch (ArithmeticException e) {
            System.out.println("Dont divise be 0! ");
            excepCounts[1]++;
        }
        catch (NegativeArraySizeException e) {
            System.out.println("everything is going wrong! ");
            excepCounts[2]++;
        }
        catch (NullPointerException e) {
            System.out.println("something with a object reference is wrong ");
            excepCounts[3]++;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("going out of the bounds! ");
            excepCounts[4]++;
        }
    }
    public void resetCounts() {
        calls = 0;
        succesfullCalls = 0;
        totalReturned = 0;
        for (int i = 0; i < 5; i++) {
            excepCounts[i] = 0;
        }
    }
    public void nRandInts(int n) {
        for (int i = 0; i < n; i++){
                callIt();
        }
        System.out.print("\n====================\n");
    }
    public void writeData() {
    
        System.out.println("The number of calls to BadRandom.randVal(): "+ calls);
        System.out.println("The number of successful calls to BadRandom.randVal(): " + succesfullCalls);
        System.out.println("The total of the values returned by the successful calls: " + totalReturned);
        System.out.println("ClassCastException: %"+ excepCounts[0] * 100 / calls);
        System.out.println("ArithmeticException: %"+ excepCounts[1] * 100 / calls);
        System.out.println("NegativeArraySizeException: %"+ excepCounts[2] * 100 / calls);
        System.out.println("NullPointerException: %"+ excepCounts[3] * 100 / calls);
        System.out.println("ArrayIndexOutOfBoundsException: %"+ excepCounts[4] * 100 / calls);
        System.out.println("succesfull calls: %"+ succesfullCalls * 100 / calls);
    }
    public static void main(String[] args) {
        BRTest me = new BRTest();
        me.resetCounts();
        me.nRandInts(30);
        me.writeData();
    }
}
