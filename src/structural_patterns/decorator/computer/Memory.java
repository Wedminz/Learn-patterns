package structural_patterns.decorator.computer;

import java.util.ArrayList;

public class Memory implements ComponentDecorator {
    Component wrapped;

    public Memory(Component c) {
        setWrapped(c);
    }

    @Override
    public void setWrapped(Component c) {
        wrapped = c;
    }

    @Override
    public ArrayList<String> getDescription() {
        ArrayList<String> arrayList = wrapped.getDescription();
        arrayList.add("Toshiba STOR.E 1TB");
        return arrayList;
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 4630.;
    }
}
