package pattern.generate.abstractFactory;

import pattern.generate.abstractFactory.factory.FurnitureFactory;
import pattern.generate.abstractFactory.factory.ModernFurnitureFactory;
import pattern.generate.abstractFactory.factory.VictorianFurnitureFactory;
import pattern.generate.abstractFactory.model.Chair;
import pattern.generate.abstractFactory.model.Sofa;
import pattern.generate.abstractFactory.model.Table;

import java.util.Scanner;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стиль мебели");
        String type = sc.next();
        FurnitureFactory factory = null;
        if ("Викторианский_стиль".equals (type)) { factory=new VictorianFurnitureFactory();
        } else if ("Модерн стиль".equals (type)) { factory=new ModernFurnitureFactory();        }

        System.out.println("Введите товар, который хотите заказать");
        String productType = sc.next();
        if ("Стол".equals (productType)) {
            Table t=  factory.createTable();
        }
        else if ("Стул".equals (productType)) {
            Chair c = factory.cteateChair();        }
        else if ("Софа".equals (productType)) {
            Sofa s = factory.createSofa()   ;        }

    }
}
