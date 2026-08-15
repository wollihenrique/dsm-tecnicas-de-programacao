public class Main {
    public static void main(String[] args) {
       int A = 10, B = 20, C = 0;

       System.out.println("A = " + A);
       System.out.println("B = " + B);

       C = A;
       A = B;
       B = C;

       System.out.println("A = " + A);
       System.out.println("B = " + B);
    }
}