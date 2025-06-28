package Eje1;

public class Register {
    private int key;      // Clave que se usará como índice en la tabla hash
    private String name;  // Nombre asociado al registro

    // Constructor para inicializar el registro con clave y nombre
    public Register(int key, String name) {
        this.key = key;
        this.name = name;
    }

    // Retorna la clave del registro
    public int getKey() {
        return key;
    }

    // Retorna el nombre del registro
    public String getName() {
        return name;
    }

    // Representación en texto del objeto Register
    public String toString() {
        return "(" + key + ", " + name + ")";
    }
}
