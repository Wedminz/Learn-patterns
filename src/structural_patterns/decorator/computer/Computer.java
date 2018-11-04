package structural_patterns.decorator.computer;

import java.util.ArrayList;

public class Computer implements Component {
    @Override
    public ArrayList<String> getDescription() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("My computer");
        return arrayList;
    }

    @Override
    public double getCost() {
        return 33000.0;
    }
}
