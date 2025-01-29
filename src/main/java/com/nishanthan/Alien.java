package com.nishanthan;

public class Alien {
    private String framework;
    private Laptop laptop;
    private Computer comp;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    private String role;
    private float yoe;

    public float getYoe() {
        return yoe;
    }

    public void setYoe(float yoe) {
        this.yoe = yoe;
    }

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

    public Alien(String role, float yoe) {
        this.role = role;
        this.yoe = yoe;
    }

    public void code() {
        System.out.println("I'm Coding.....");
        laptop.compile();
        comp.compile();
    }
}
