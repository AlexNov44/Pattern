package pattern.generate.abstractFactory.model.modern;

import pattern.generate.abstractFactory.model.Chair;

public class ModernChair implements Chair {
    @Override
    public int hasLegs() {
        return 0;
    }

    @Override
    public void sitOn() {
        System.out.println("Сижу на ModernChair");

    }
}
