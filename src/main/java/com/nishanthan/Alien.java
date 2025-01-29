package com.nishanthan;

public class Alien {
    private String framework;

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public Alien() {
        System.out.println("Alien obj created");
    }

    public void code() {
        System.out.println("I'm Coding.....");
    }
}
