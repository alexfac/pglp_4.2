package uvsq.command;

import uvsq.Commande;
import uvsq.DivisionPar0;
import uvsq.MoteurRpn;
import uvsq.Operation;

public class OperationCommand implements Commande {

  private MoteurRpn rpn;
  private Operation op;

  /**
   * Constructeur operation.
   * @param rpn moteur
   * @param op operation
   */
  public OperationCommand(MoteurRpn rpn, Operation op) {

    this.rpn = rpn;
    this.op = op;
  }

  public void registerOperateur(Operation op) {
    this.op = op;
  }

  @Override
  public void apply() {

    double res = 0;
    if (this.rpn.pile.size() >= 2) {
      try {
        res = op.eval(this.rpn.pile.pop(), this.rpn.pile.pop());
        this.rpn.enregistrer(res);
      } catch (DivisionPar0 divisionPar0) {
        divisionPar0.printStackTrace();
      }
    } else {
      System.out.println("Pas assez d'operandes");
    }
  }
}
