package pattern.generate.abstractFactory.model.victorian;

import pattern.generate.abstractFactory.model.Chair;

public class VictorianChair implements Chair {
    @Override
    public int hasLegs() {
        return 6;

    }

    @Override
    public void sitOn() {
        System.out.println("Vict chair");

    }
}
