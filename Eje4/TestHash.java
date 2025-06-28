package Eje4;

public class TestHash {
	public static void main(String[] args) {
        HashC tabla = new HashC(7);

        // Inserciones
        tabla.insert(new Register(5, "cinco"));
        tabla.insert(new Register(12, "doce"));
        tabla.insert(new Register(19, "diecinueve"));

        System.out.println("\nTabla después de insertar:");
        tabla.printTable();

        // Eliminación lógica
        System.out.println("\nEliminando la clave 12...");
        tabla.delete(12);
        tabla.printTable();

        // Buscar la clave 19 después de eliminar 12
        System.out.println("\nBuscando la clave 19 después de eliminar 12...");
        Register reg = tabla.search(19);
        if (reg != null) {
            System.out.println("Clave 19 encontrada: " + reg);
        } else {
            System.out.println("Clave 19 NO encontrada.");
        }
    }
}