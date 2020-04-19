package uvsq21603110.Command;

import uvsq21603110.Commande;
import uvsq21603110.Interpreteur;

public class Exit_Command implements Commande {

  private Interpreteur interpre;

  public Exit_Command(Interpreteur interpre) {
    this.interpre = interpre;
  }

  @Override
  public void apply() {
    this.interpre.exit();
  }
}
