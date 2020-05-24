package uvsq.command;

import uvsq.Commande;
import uvsq.MoteurRpn;

public class ReturnCommand implements Commande {

  private MoteurRpn rpn;

  public ReturnCommand(MoteurRpn rpn) {
    this.rpn = rpn;
  }

  @Override
  public void apply() {
    this.rpn.retourner();
  }
}
