package HashAbierto;

public class TestHashO {
    public static void main(String[] args) {
        HashO tabla = new HashO(7);

        tabla.insert(new Register(10, "Ana"));
        tabla.insert(new Register(24, "Luis"));
        tabla.insert(new Register(17, "Juan"));
        tabla.insert(new Register(3, "Pedro"));
        tabla.insert(new Register(17, "Dani")); // Duplicado permitido
        tabla.insert(new Register(10, "Santi"));

        System.out.println("\nTabla hash después de insertar:");
        tabla.printTable();

        System.out.println("\nEliminando la clave 17...");
        tabla.delete(17);

        System.out.println("\nTabla hash después de eliminar 17:");
        tabla.printTable();

        System.out.println("\nBuscando la clave 24...");
        Register resultado = tabla.search(24);
        if (resultado != null) {
            System.out.println("Clave 24 encontrada: " + resultado);
        } else {
            System.out.println("Clave 24 NO encontrada.");
        }
    }
}
