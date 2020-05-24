package uvsq;

import java.util.Stack;

public class Interpreteur {
  public Stack<Double> pile;

  public Interpreteur() {
    this.pile = new Stack<Double>();
  }

  public void exit() {
    System.exit(0);
  }

  /**
   * Retour en arriere.
   */
  public void undo() {
    if (this.pile.size() >= 1) {
      this.pile.pop();
    }
  }
}
