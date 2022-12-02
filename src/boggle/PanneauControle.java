package boggle;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class PanneauControle extends VBox implements Observateur {

    private Button valider ;
    private Button effacer ;
    private Button quitter ;

    public PanneauControle(Boggle bog) {
        this.valider = new Button("Valider");
        this.effacer = new Button("Effacer");
        this.quitter = new Button("Quitter");
        this.getChildren().addAll(this.valider, this.effacer, this.quitter);
        this.quitter.setOnAction(event -> Platform.exit());
        this.valider.setOnAction(new EcouteurValider(bog));
        this.effacer.setOnAction(new EcouteurEffacer(bog));

    }

    @Override
    public void reagir() {

    }
}
