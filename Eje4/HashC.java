package Eje4;

// Implementación de una tabla hash usando genéricos y hash cerrado (sondeo lineal)
public class HashC {
    public static class Element {
        Register register;   // Registro guardado
        boolean isAvailable; // Indica si la celda está disponible

        public Element() {
            this.register = null;
            this.isAvailable = true;
        }
    }

    private Element[] table; // Arreglo de elementos (la tabla hash)
    private int size;        // Tamaño de la tabla

    // Constructor: inicializa el arreglo table con objetos Element vacíos
    public HashC(int size) {
        this.size = size;
        this.table = new Element[size];
        for (int i = 0; i < size; i++) {
            this.table[i] = new Element();
        }
    }

    // Función hash: key % size
    private int hash(int key) {
        return Math.abs(key) % size;
    }

    // Inserta un nuevo registro usando sondeo lineal
    public void insert(Register reg) {
        int idx = hash(reg.getKey());
        for (int i = 0; i < size; i++) {
            int pos = (idx + i) % size;
            Element cell = table[pos];
            if (cell.isAvailable) {
                cell.register = reg;
                cell.isAvailable = false;
                System.out.println("Insertado en posición " + pos + ": " + reg);
                return;
            }
        }
        System.out.println("ERROR: La tabla está llena, no se pudo insertar " + reg);
    }

    // Busca un registro por clave usando sondeo lineal
    public Register search(int key) {
        int idx = hash(key);
        for (int i = 0; i < size; i++) {
            int pos = (idx + i) % size;
            Element cell = table[pos];
            if (cell.isAvailable && cell.register == null) {
                // Celda nunca usada: no está en la tabla
                return null;
            }
            if (!cell.isAvailable && cell.register.getKey() == key) {
                return cell.register;
            }
        }
        return null;
    }

    // Elimina un registro de forma lógica (no física)
    public void delete(int key) {
        int idx = hash(key);
        for (int i = 0; i < size; i++) {
            int pos = (idx + i) % size;
            Element cell = table[pos];
            if (cell.isAvailable && cell.register == null) {
                // Celda nunca usada: no está en la tabla
                System.out.println("No se encontró la clave " + key + " para eliminar.");
                return;
            }
            if (!cell.isAvailable && cell.register.getKey() == key) {
                cell.isAvailable = true; // Disponible para nuevos registros
                System.out.println("Eliminado lógicamente de la posición " + pos + ": " + cell.register);
                return;
            }
        }
        System.out.println("No se encontró la clave " + key + " para eliminar.");
    }

    // Imprime el estado actual de la tabla hash
    public void printTable() {
        System.out.println("Estado actual de la tabla hash:");
        for (int i = 0; i < size; i++) {
            Element cell = table[i];
            System.out.print(i + ": ");
            if (cell.isAvailable) {
                System.out.println("VACÍO");
            } else {
                System.out.println(cell.register);
            }
        }
    }
}