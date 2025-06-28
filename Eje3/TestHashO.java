package Eje3;

public class TestHashO {
	public static void main(String[] args) {
        HashO tabla = new HashO(5);

        // Inserciones
        tabla.insert(new Register(10, "Juan"));
        tabla.insert(new Register(15, "Ana"));
        tabla.insert(new Register(20, "Luis"));
        tabla.insert(new Register(25, "Rosa"));

        System.out.println("\nTabla hash después de insertar:");
        tabla.printTable();

        // Buscar la clave 20
        Register encontrado = tabla.search(20);
        if (encontrado != null) {
            System.out.println("\nNombre asociado a la clave 20: " + encontrado.getName());
        } else {
            System.out.println("\nClave 20 no encontrada.");
        }

        // Buscar la clave 30 (no existe)
        Register noEncontrado = tabla.search(30);
        if (noEncontrado != null) {
            System.out.println("\nNombre asociado a la clave 30: " + noEncontrado.getName());
        } else {
            System.out.println("\nClave 30 no encontrada.");
        }
    }
}