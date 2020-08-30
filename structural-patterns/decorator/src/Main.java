import com.company.DoughAdderSource;
import com.company.decorators.BeaconAdderDecorator;
import com.company.decorators.CheezeAdderDecorator;

public class Main {
    public static void main(String[] args) {
        var decorator = new BeaconAdderDecorator(new CheezeAdderDecorator(new DoughAdderSource()));
        decorator.addComponent();
    }
}
