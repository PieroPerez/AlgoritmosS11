package Eje1;

public class TestHashO {
    public static void main(String[] args) {
        HashO tabla = new HashO(7);

        // Insertar los valores pedidos, todos colisionan en bucket 3
        tabla.insert(new Register(3, "tres"));
        tabla.insert(new Register(10, "diez"));
        tabla.insert(new Register(17, "diecisiete"));
        tabla.insert(new Register(24, "veinticuatro"));

        System.out.println("\nTabla hash final (con colisiones en bucket 3):");
        tabla.printTable();
    }
}