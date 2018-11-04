package structural_patterns.decorator;

import structural_patterns.decorator.computer.*;

public class Demo2 {

    public static void main(String[] args) {
        Component computer = new Computer();
        computer = new KeyBoard(computer);
        computer = new Mouse(computer);
        computer = new Memory(computer);
        computer = new Memory(computer);
        System.out.println("Order for my computer");
        for (String part : computer.getDescription()){
            System.out.println("Component: "+part);
        }
        System.out.println("Total cost: "+computer.getCost());
    }
}
