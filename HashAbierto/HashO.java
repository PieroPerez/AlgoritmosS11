package HashAbierto;

import java.util.LinkedList;

public class HashO {
    private LinkedList<Register>[] table; // Arreglo de listas enlazadas
    private int size;

    @SuppressWarnings("unchecked")
    public HashO(int size) {
        this.size = size;
        this.table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return Math.abs(key) % size;
    }

    public void insert(Register reg) {
        int idx = hash(reg.getKey());
        table[idx].add(reg); // Permite duplicados
        System.out.println("Insertado en bucket " + idx + ": " + reg);
    }

    public Register search(int key) {
        int idx = hash(key);
        for (Register reg : table[idx]) {
            if (reg.getKey() == key) {
                return reg;
            }
        }
        return null;
    }

    public void delete(int key) {
        int idx = hash(key);
        for (Register reg : table[idx]) {
            if (reg.getKey() == key) {
                table[idx].remove(reg);
                System.out.println("Eliminado del bucket " + idx + ": " + reg);
                return;
            }
        }
        System.out.println("No se encontró la clave " + key + " para eliminar.");
    }

    public void printTable() {
        System.out.println("Estado actual de la tabla hash:");
        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            if (table[i].isEmpty()) {
                System.out.println("VACÍO");
            } else {
                System.out.println(table[i]);
            }
        }
    }
}
