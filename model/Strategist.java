package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Strategist extends Hero {

    final int healing;

    public Strategist(String name, String team, int maxHP, int healing) {
        super(name, team, maxHP);
        this.currentHP = maxHP;
        this.healing = healing;
    }

    public void heal(Hero name) {
        System.out.println(getName() + " healed " + name + ".");
        if((name.getCurrentLife() + this.healing) <= name.getMaxHealth()) {
            name.currentHP = name.getMaxHealth();
        } else {
            name.currentHP = name.currentHP + this.healing;
        }
    }

    public void healSelf() {
        System.out.println(getName() + " healed themself.");
        if((this.getCurrentLife() + this.healing) <= this.getMaxHealth()) {
            this.currentHP = this.getMaxHealth();
        } else {
            this.currentHP = this.currentHP + this.healing;
        }
    }

    @Override
    public String toString() {
        return (getName() + " is a supporting Hero that can heal.");
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
        if (!(obj instanceof Strategist)) {
            System.out.println("wrong type");
            return false;
        }

        Strategist other = (Strategist) obj;

        if (!(this.getName().equals(other.getName()))) {
            System.out.println("name is different");
            return false;
        }
        if (!(this.getMaxHealth() == other.getMaxHealth())) {
            System.out.println("max health is different");
            return false;
        }
        if (this.healing == other.healing) {
            System.out.println("healing stat is different");
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int res = getName().hashCode();
        res = 31 * res + getMaxHealth();
        res = 31 * res + this.healing;

        return res;
    }

    @Override
    public void toCsv() {
        File openFile = new File("Strategist.CSV");

        if(!(openFile.length() == 0)) {
            try (FileWriter writer = new FileWriter(openFile)) {
                writer.write("Name, Team, Max Health, Healing");
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred writing the file.");
            }
        }
        try (FileWriter addWriter = new FileWriter(openFile)) {
            addWriter.write((getName() + ", " + getTeam() + ", " + getMaxHealth() + ", " + this.healing));
            addWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred writing the file.");
        }
    }

}