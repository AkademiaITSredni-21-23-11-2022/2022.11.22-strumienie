package pl.it.akademia.typy.wyliczeniowe;

public enum Console {
    PS1("Sony", "Playstation 1", 100, 1999),
    PS2("Sony", "Playstation 2", 300, 2003),
    PS3("Sony", "Playstation 3", 600, 2005),
    XBOX("Microsoft", "Xbox", 200, 2001),
    SWITCH("Nintendo", "Switch", 2000, 2013);

    private String brand;
    private String model;
    private int speed;
    private int year;

    Console(String brand, String model, int speed, int year) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
