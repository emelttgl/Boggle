package boggle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurValider implements EventHandler<ActionEvent> {
    private Boggle boggle;

    public EcouteurValider (Boggle bogg){
        this.boggle=bogg;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        boggle.valider();
    }
}
