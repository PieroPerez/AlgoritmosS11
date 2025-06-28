package Eje2;

public class TestHash {
    public static void main(String[] args) {
        HashC tabla = new HashC(6);

        // Inserciones paso a paso
        tabla.insert(new Register(12, "doce"));    // 12 % 6 = 0
        tabla.printTable();
        System.out.println("----------------");

        tabla.insert(new Register(18, "dieciocho")); // 18 % 6 = 0 (colisión)
        tabla.printTable();
        System.out.println("----------------");

        tabla.insert(new Register(24, "veinticuatro")); // 24 % 6 = 0 (colisión)
        tabla.printTable();
        System.out.println("----------------");

        tabla.insert(new Register(30, "treinta")); // 30 % 6 = 0 (colisión)
        tabla.printTable();
        System.out.println("----------------");
    }
}
