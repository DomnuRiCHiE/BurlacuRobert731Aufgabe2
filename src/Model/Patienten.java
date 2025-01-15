package Model;

import java.util.ArrayList;
import java.util.List;

public class Patienten {
    private int id;
    private String name;
    private int age;
    private String diagnostic;
    private List<Medikamente> medikamente;

    public Patienten(int id, String name, int age, String diagnostic, List<Medikamente> medikamente) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnostic = diagnostic;
        this.medikamente = medikamente;
    }

    public Patienten() {}

    public Patienten(int id, String name, Integer age, String diagnostic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnostic = diagnostic;
        this.medikamente = new ArrayList<Medikamente>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public List<Medikamente> getMedikamente() {
        return medikamente;
    }

    public void setMedikamente(List<Medikamente> medikamente) {
        this.medikamente = medikamente;
    }

    @Override
    public String toString() {
        return "Patienten{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", diagnostic='" + diagnostic + '\'' +
                ", medikamente=" + medikamente +
                '}';
    }
}
