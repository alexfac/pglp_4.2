package uvsq.command;

import uvsq.Commande;
import uvsq.Interpreteur;

public class ExitCommand implements Commande {

  private Interpreteur interpre;

  public ExitCommand(Interpreteur interpre) {
    this.interpre = interpre;
  }

  @Override
  public void apply() {
    this.interpre.exit();
  }
}
