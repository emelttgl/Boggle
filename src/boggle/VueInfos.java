package boggle;

import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class VueInfos extends TilePane implements Observateur{
    private Label score, motChoisi;
    private Boggle bogg;


    public VueInfos(Boggle bogg) {
        this.bogg = bogg;
        score=new Label("Score : "+bogg.getScore());
        motChoisi=new Label("Mot choisi : "+bogg.getMotChoisi());
        this.getChildren().addAll(motChoisi,score);
        this.bogg.ajouterObservateur(this);
    }



    @Override
    public void reagir() {
        score.setText("Score : "+bogg.getScore());
        motChoisi.setText("Mot choisi : "+bogg.getMotChoisi());
    }
}
