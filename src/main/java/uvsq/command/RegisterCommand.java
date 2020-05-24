package uvsq.command;

import uvsq.Commande;
import uvsq.MoteurRpn;

public class RegisterCommand implements Commande {

  private MoteurRpn rpn;
  private double valeur;

  public RegisterCommand(MoteurRpn rpn, double valeur) {
    this.rpn = rpn;
    this.valeur = valeur;
  }

  public void registerValeur(double valeur) {
    this.valeur = valeur;
  }

  @Override
  public void apply() {
    this.rpn.pile.push(valeur);
  }
}
