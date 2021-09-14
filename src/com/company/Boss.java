package com.company;

public class Boss extends GameEntity {
    public String printInfo(){
        return getHealth() + " " + getDamage() + " " + getSuperPower() +
                " " + getWeapon().getName() + " " + getWeapon().getType();
    }
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
