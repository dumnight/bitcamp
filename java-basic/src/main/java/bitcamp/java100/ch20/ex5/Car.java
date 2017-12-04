package bitcamp.java100.ch20.ex5;

public class Car {
    private String model;
    private String color;
    private int capacity;
    private Engine Engine;
    
    public Car() {
        System.out.println("Car()");
    }
    
    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", capacity=" + capacity + ", Engine=" + Engine + "]";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Engine getEngine() {
        return Engine;
    }

    public void setEngine(Engine engine) {
        Engine = engine;
    }
   

    
    
}
