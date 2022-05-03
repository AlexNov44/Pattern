package pattern.generate.abstractFactory.factory;

import pattern.generate.abstractFactory.model.Chair;
import pattern.generate.abstractFactory.model.Sofa;
import pattern.generate.abstractFactory.model.Table;

public interface FurnitureFactory {
    Chair  cteateChair();
    Table createTable();
    Sofa createSofa();

}
