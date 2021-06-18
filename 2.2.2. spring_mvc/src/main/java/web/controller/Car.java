package web.controller;

public class Car {

    public Car() {}

    public Car(int id, String name, String model){
        this.id = id;
        this.name = name;
        this.model = model;
    }

    private int id;

    private String name;

    private String model;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Номер: " + id + ", Машина: " + name;
    }
}
