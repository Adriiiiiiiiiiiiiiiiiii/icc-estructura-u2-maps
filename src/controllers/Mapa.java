package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
        System.out.println("================== HashMap<String, String> ==================");
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "Pc");  // Sobrescribe el anterior con clave "003"

        System.out.println("Contenido del HashMap: " + mapa);
        System.out.println("Claves del mapa: " + mapa.keySet());

        for (String clave : mapa.keySet()) {
            System.out.println("Valor para clave " + clave + ": " + mapa.get(clave));
        }

        System.out.println("Valor para clave '001': " + mapa.get("001"));
        System.out.println("Valor para clave '005': " + mapa.get("005")); // null
    }

    public void runLinkedHashMap() {
        System.out.println("================== LinkedHashMap<Integer, String> ==================");
        Map<Integer, String> mapa2 = new LinkedHashMap<>();
        mapa2.put(1, "Adriano");
        mapa2.put(2, "Daniel");
        mapa2.put(3, "Emma");
        mapa2.put(4, "Joey");
        mapa2.put(5, "Pablo");

        System.out.println("Contenido del LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : mapa2.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " => Valor: " + entry.getValue());
        }
    }

    public void runTreeMap() {
        System.out.println("================== TreeMap<Integer, String> ==================");
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        System.out.println("Contenido del TreeMap ordenado por clave:");
        for (Map.Entry<Integer, String> entry : items.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " => Valor: " + entry.getValue());
        }
    }

    public void runHashMapObj() {
        System.out.println("================== HashMap<Empleado, Integer> ==================");
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);  // Reemplaza al primero
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        System.out.println("Contenido del HashMap de empleados:");
        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + " => Salario: " + entry.getValue());
        }
    }

    public void runTreeMapObj() {
        System.out.println("================== TreeMap<Empleado, Integer> ==================");
        Map<Empleado, Integer> empleados = new TreeMap<>(); // Necesitaría que Empleado implemente Comparable
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);

        System.out.println("Contenido del TreeMap de empleados:");
        for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + " => Salario: " + entry.getValue());
        }
    }
}
