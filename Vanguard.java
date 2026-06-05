package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Vanguard extends Hero {

    final int shieldHealth;
    final int DPS;

    public Vanguard(String name, String team, int maxHP, int shieldHealth, int DPS) {
        super(name, team, maxHP);
        this.currentHP = maxHP;
        this.shieldHealth = shieldHealth;
        this.DPS = DPS;
    }

    public void attack(Hero target) {
        System.out.println(getName() + " attacked " + target);
        target.takeDamage(this.DPS);
    }

    @Override void takeDamage(int damage) {
        if (damage < shieldHealth) {
            System.out.println(getName() + " blocked the damage.");
        } else if(this.currentHP <= (damage - this.shieldHealth)) {
            System.out.println(getName() + " died.");
            this.currentHP = getMaxHealth();
        } else {
            System.out.println(getName() + " took " + damage + " damage.");
            this.currentHP = (this.currentHP - damage + this.shieldHealth);
        }
    }

    @Override
    public String toString() {
        return (getName() + " is a strong Hero with a lots of health.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            System.out.println("obj is null");
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            System.out.println("wrong type");
            return false;
        }
        if (!(obj instanceof Vanguard)) {
            System.out.println("wrong type");
            return false;
        }

        Vanguard other = (Vanguard) obj;

        if (!(this.getName().equals(other.getName()))) {
            System.out.println("name is different");
            return false;
        }
        if (!(this.getMaxHealth() == other.getMaxHealth())) {
            System.out.println("max health is different");
            return false;
        }
        if (this.shieldHealth == other.shieldHealth) {
            System.out.println("shield health is different");
            return false;
        }
        if (this.DPS == other.DPS) {
            System.out.println("damage stat is different");
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int res = getName().hashCode();
        res = 31 * res + getMaxHealth();
        res = 31 * res + this.shieldHealth;
        res = 31 * res + this.DPS;

        return res;
    }

    @Override
    public void toCsv() {
        File openFile = new File("Vanguard.CSV");

        if(!(openFile.length() == 0)) {
            try (FileWriter writer = new FileWriter(openFile)) {
                writer.write("Name, Team, Max Health, Shield Health, DPS");
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred writing the file.");
            }
        }
        try (FileWriter addWriter = new FileWriter(openFile)) {
            addWriter.write((getName() + ", " + getTeam() + ", " + getMaxHealth() + ", " + this.shieldHealth + ", " + this.DPS));
            addWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred writing the file.");
        }
    }

}