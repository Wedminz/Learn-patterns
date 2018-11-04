package structural_patterns.decorator.computer;

public interface ComponentDecorator extends Component {
    public void setWrapped(Component c);
}
