package com.nishanthan;

public class Alien {
    private String framework;
    private Laptop laptop;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public Alien() {
        System.out.println("Alien obj created");
    }

    public Alien(String role) {
        this.role = role;
    }

    public void code() {
        System.out.println("I'm Coding.....");
        laptop.compile();
    }
}
