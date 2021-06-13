package HerançaMultipla.Application;

import HerançaMultipla.Devices.ComboDevice;
import HerançaMultipla.Devices.ConcretePrinter;
import HerançaMultipla.Devices.ConcreteScanner;

public class Application {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: "+ s.scan());

        System.out.println();
        ComboDevice d = new ComboDevice("2081");
        d.processDoc("My dissertation");
        d.print("My dissertation");
        System.out.println("Scan result: "+ d.scan());
    }
}
