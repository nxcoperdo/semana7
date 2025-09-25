package org.example;

import org.example.biblioteca.*;

public class Main {
    public static void main(String[] args) {
        MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];
        materiales[0] = new Libro("Don Quijote", "Miguel de Cervantes", 1605, "Novela");
        materiales[1] = new Revista("National Geographic", "National Geographic Society", 2023, 256);
        materiales[2] = new Tesis("Inteligencia Artificial", "Juan Pérez", 2024, "Universidad Tecnológica");
        System.out.println("Materiales en la biblioteca:");
        System.out.println("---------------------------");
        for (MaterialBiblioteca material : materiales) {
            material.mostrarInfo();
            System.out.println("---------------------------");
        }
    }
}
