package uvsq.command;

import uvsq.Commande;
import uvsq.Interpreteur;

public class UndoCommand implements Commande {

  private Interpreteur interpre;

  public UndoCommand(Interpreteur interpre) {
    this.interpre = interpre;
  }

  @Override
  public void apply() {

    this.interpre.undo();
  }
}
