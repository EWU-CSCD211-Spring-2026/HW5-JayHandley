package test;

import model.*;

public class App {
    public static void main(String[] args) {
        Strategist Jeff = new Strategist("Jeff", "Blue", 250, 150);
        Strategist Loki = new Strategist("Loki", "Red", 275, 100);
        Duelist Punisher = new Duelist("Punisher", "Blue", 300, false, 360);
        Duelist IronMan = new Duelist("IronMan", "Red", 250, true, 140);
        Vanguard Magneto = new Vanguard("Magneto", "Blue", 650, 20, 80);
        Vanguard DrStrange = new Vanguard("DrStrange", "Red", 675, 80, 16);
        Arena Asgard = new Arena(0, 0);

        IronMan.fly();
        Punisher.attack(DrStrange);
        DrStrange.attack(Punisher);
        Jeff.heal(Punisher);
        IronMan.attack(Magneto);
        Asgard.increaseRed(20);
        Loki.heal(DrStrange);
        Punisher.attack(Loki);
        Asgard.increaseBlue(50);
        IronMan.attack(Jeff);
        Jeff.healSelf();
        Asgard.increaseRed(50);
        Magneto.attack(DrStrange);
        Punisher.attack(IronMan);
        Asgard.increaseBlue(50);
    }
}
