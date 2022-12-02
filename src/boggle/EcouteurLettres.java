package boggle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class EcouteurLettres implements EventHandler<ActionEvent> {
    private Boggle bogg;
    private int lig,col;

    public EcouteurLettres (Boggle bogg, int lig, int col){
        this.bogg=bogg;
        this.lig=lig;
        this.col=col;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
      this.bogg.ajouterLettre(this.lig,this.col);

    }
}
