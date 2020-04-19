package uvsq21603110.Command;

import uvsq21603110.Commande;
import uvsq21603110.Interpreteur;
import uvsq21603110.MoteurRPN;

public class Undo_Command implements Commande {

  private Interpreteur interpre;

  public Undo_Command(Interpreteur interpre) {
    this.interpre = interpre;
  }

  @Override
  public void apply() {

    this.interpre.undo();
  }
}
