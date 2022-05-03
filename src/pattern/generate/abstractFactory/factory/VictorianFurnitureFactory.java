package pattern.generate.abstractFactory.factory;

import pattern.generate.abstractFactory.model.Chair;
import pattern.generate.abstractFactory.model.Sofa;
import pattern.generate.abstractFactory.model.Table;
import pattern.generate.abstractFactory.model.victorian.VictorianChair;
import pattern.generate.abstractFactory.model.victorian.VictorianSofa;
import pattern.generate.abstractFactory.model.victorian.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair cteateChair() {
        System.out.println("Викториан стул изготовлен");
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Викториан стол изготовлен");
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Викториан софа изготовлен");
        return new VictorianSofa();
    }
}
