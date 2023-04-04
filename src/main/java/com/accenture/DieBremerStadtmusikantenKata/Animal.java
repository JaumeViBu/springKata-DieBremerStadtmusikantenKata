package com.accenture.DieBremerStadtmusikantenKata;

public class Animal {
    protected String name;
    protected String sound;
    protected Boolean singing=false;
    private String animalType="animal";

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
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

    public void startSinging(){
        StringBuilder msg=new StringBuilder("El ");
        msg.append(animalType);
        msg.append(" ");
        msg.append(this.name);
        msg.append(" esta cantando ");
        msg.append(this.sound);
        System.out.println(msg.toString());
        this.singing=true;
    };
    public void stopSinging(){
        StringBuilder msg=new StringBuilder("El ");
        msg.append(animalType);
        msg.append(" ");
        msg.append(this.name);
        msg.append(" no quiere cantar");
        System.out.println(msg.toString());
        this.singing=false;
    };
}
