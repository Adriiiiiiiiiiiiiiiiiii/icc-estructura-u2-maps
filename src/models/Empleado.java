package models;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "\nID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Empleado empleado = (Empleado) obj;
        return id == empleado.id && Objects.equals(name, empleado.name);
    }

    @Override
        public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + name.hashCode(); // Aquí aplicamos la multiplicación por 31
        return result;
    }

    @Override
    public int compareTo(Empleado o) {
    int comparacionId= Integer.compare(id, o.id);
       if(this.id != o.id){
        return Integer.compare(this.id, o.id);
       }
       return this.name.compareTo(o.name); 
    }
}
