public class Main {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("Conjunção:");
        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));

        System.out.println("\nDisjunção:");
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("b2 || b4: " + (b2 || b4));

        System.out.println("\nDisjunção exclusiva:");
        System.out.println("b1 ^ b3: " + (b1 ^ b3));
        System.out.println("b4 ^ b1: " + (b4 ^ b1));

        System.out.println("\nNegação:");
        System.out.println("!b1: " + (!b1));
        System.out.println("!b2: " + (!b2));

    }
}