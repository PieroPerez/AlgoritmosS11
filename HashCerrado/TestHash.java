package HashCerrado;

public class TestHash {
    public static void main(String[] args) {
        HashC tabla = new HashC(11); // Usa un tamaño suficiente para ver colisiones

        // Inserta los valores especificados, cada uno con nombre único
        tabla.insert(new Register(34, "Ana"));
        tabla.insert(new Register(3, "Luis"));
        tabla.insert(new Register(7, "Juan"));
        tabla.insert(new Register(30, "Karla"));
        tabla.insert(new Register(11, "Pedro"));
        tabla.insert(new Register(8, "Maria"));
        tabla.insert(new Register(7, "Dani"));    // Clave repetida (no debe insertarse)
        tabla.insert(new Register(23, "Sofía"));
        tabla.insert(new Register(41, "Pablo"));
        tabla.insert(new Register(16, "Elena"));
        tabla.insert(new Register(34, "Santi"));  // Clave repetida (no debe insertarse)

        System.out.println("Tabla hash después de insertar:");
        tabla.printTable();

        System.out.println("\nEliminando la clave 30...");
        tabla.delete(30);

        System.out.println("\nTabla hash después de eliminar 30:");
        tabla.printTable();

        System.out.println("\nBuscando la clave 23...");
        Register resultado = tabla.search(23);
        if (resultado != null) {
            System.out.println("Clave 23 encontrada: " + resultado);
        } else {
            System.out.println("Clave 23 NO encontrada.");
        }
    }
}
