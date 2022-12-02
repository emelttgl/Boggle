package boggle;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class VueLettres extends GridPane implements Observateur {

    private Button[][] tabBoutons;
    private Boggle boggle;

    public VueLettres(Boggle boggle) {
        this.boggle = boggle;
        tabBoutons = new Button[boggle.getTaille()][boggle.getTaille()];
        for (int i = 0; i < boggle.getTaille(); i++) {
            for (int j = 0; j < boggle.getTaille(); j++) {
                tabBoutons[i][j] = new Button("" + boggle.getLettre(i, j));
                this.getChildren().add(tabBoutons[i][j]);
                GridPane.setConstraints(tabBoutons[i][j], i, j);
                tabBoutons[i][j].setOnAction(new EcouteurLettres(boggle, i, j));
                tabBoutons[i][j].setPrefSize(40,40);
            }

        }

        boggle.ajouterObservateur(this);
    }

    @Override
    public void reagir() {

    }




}
