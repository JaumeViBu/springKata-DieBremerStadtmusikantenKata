package com.accenture.DieBremerStadtmusikantenKata;

public class Cat {

    private String name;
    private String sound;
    private Boolean singing=false;

    public Cat(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }

    public Boolean isSinging() {
        return this.singing;
    }

    public void startSinging() {
        StringBuilder msg=new StringBuilder("El gato ");
        msg.append(this.name);
        msg.append(" esta cantando ");
        msg.append(this.sound);
        System.out.println(msg.toString());
        this.singing=true;
    }

    public void stopSinging() {
        this.singing=false;
    }
}
