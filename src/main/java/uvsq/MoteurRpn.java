package uvsq;

import java.util.Stack;

public class MoteurRpn extends Interpreteur {

  public static final double Max_Value = 99999999;
  public static final double Min_Value = 0;

  public MoteurRpn() {

    super();
  }

  /**
   * Enregistrer.
   * @param op1 operande
   */
  public void enregistrer(double op1) {

    if (Math.abs(op1) < Max_Value && Math.abs(op1) >= Min_Value) {
      pile.push(op1);
    } else {
      System.out.println("non ajoute à la pile");
    }
  }

  /**
   * enleve de la pile.
   * @param op operation
   */
  public void operation(Operation op) {

    double elem = 0;
    try {
      if (pile.size() >= 2) {
        elem = op.eval(pile.pop(), pile.pop());
      }
      pile.push(elem);
    } catch (DivisionPar0 divisionPar0) {
      divisionPar0.printStackTrace();
    }
  }

  public Stack<Double> retourner() {

    return this.pile;
  }
}
