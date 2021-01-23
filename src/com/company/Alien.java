/*
 * Classname: Alien.java
 *
 * Version information: 1.0
 *
 * Date: 21/01/2021
 *
 * Description: The class implements an Alien for a game. The health of the alien object determines if the alien is
 * alive and or dodging. If the health attribute is 0 then the alien attribute 'dead' MUST be true. The alien cannot be
 * dodging if they are dead. Likewise, the alien cannot be dead if they health value is >0.
 * Author: Dr. Shane Wilson
 *
 */

package com.company;

public class Alien {
    //Data members
    private boolean dead;
    private boolean dodging;
    private int alienHealth;

    //Class constructors
    public Alien(boolean dodging, int alienHealth) {
        this.dodging = dodging;
        this.alienHealth = alienHealth;
        if(alienHealth > 0){
            dead = false;
        }else{
            dead = true;
        }
    }

    // Methods
    //check if alien is dead
    public boolean isDead() {
        return dead;
    }

    //if alienHealth reaches, alien is dead
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    //check if alien is dodging
    public boolean isDodging() {
        return dodging;
    }

//    //if alien is not dead, alien is dodging
//    public void setDodging(boolean dodging) {
//        this.dodging = dodging;
//    }

    //check alien health
    public int getAlienHealth() {
        return alienHealth;
    }

    //set alien health
    public void setAlienHealth(int alienHealth) {
        this.alienHealth = alienHealth;

        if(alienHealth < 1){
            this.dead = true;
        }
    }

    //if alien is dead, alien is not dodging. otherwise, alien is dodging
    public void dodge() {
        if(dead){
            dodging = false;
        }else{
            dodging = true;
        }
    }

    public void hit() {
        if(alienHealth > 0){
            alienHealth--;
        }else{
            alienHealth = 0;
        }
    }

    public void miss() {
        this.dodging = false;

    }

}
