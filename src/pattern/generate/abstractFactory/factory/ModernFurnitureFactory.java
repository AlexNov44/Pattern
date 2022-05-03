package pattern.generate.abstractFactory.factory;

import pattern.generate.abstractFactory.model.Chair;
import pattern.generate.abstractFactory.model.Sofa;
import pattern.generate.abstractFactory.model.Table;
import pattern.generate.abstractFactory.model.modern.ModernChair;
import pattern.generate.abstractFactory.model.modern.ModernSofa;
import pattern.generate.abstractFactory.model.modern.ModernTable;

public class ModernFurnitureFactory implements  FurnitureFactory{
    @Override
    public Chair cteateChair() {
        System.out.println("Модерн стул изготовлен");
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Модерн стол изготовлен");
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {  System.out.println("Модерн софа изготовлена");
        return new ModernSofa();
    }
}
