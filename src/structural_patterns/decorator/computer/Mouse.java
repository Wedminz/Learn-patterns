package structural_patterns.decorator.computer;

import java.util.ArrayList;

public class Mouse implements ComponentDecorator {
    Component wrapped;

    public Mouse(Component c) {
        setWrapped(c);
    }

    @Override
    public void setWrapped(Component c) {
        wrapped = c;
    }

    @Override
    public ArrayList<String> getDescription() {
        ArrayList<String> arrayList = wrapped.getDescription();
        arrayList.add("SteelSeries Sensei MLG 62153 Black");
        return arrayList;
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 7190.;
    }
}
