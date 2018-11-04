package structural_patterns.decorator.computer;

import java.util.ArrayList;

public class KeyBoard implements ComponentDecorator {
    private Component wrapped;

    public KeyBoard(Component c) {
        setWrapped(c);
    }

    @Override
    public void setWrapped(Component c) {
        wrapped = c;
    }

    @Override
    public ArrayList<String> getDescription() {
        ArrayList<String> arrayList = wrapped.getDescription();
        arrayList.add("Logitech Keyboard K200");
        return arrayList;
    }

    @Override
    public double getCost() {
        return wrapped.getCost() + 820.;
    }
}
