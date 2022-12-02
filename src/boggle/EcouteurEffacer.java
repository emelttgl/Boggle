package boggle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurEffacer implements EventHandler<ActionEvent> {
    private Boggle bogg;

    public EcouteurEffacer (Boggle boggle){
        this.bogg=boggle;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        bogg.effacer();
    }
}
