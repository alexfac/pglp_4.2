package uvsq;

import java.util.Scanner;

public class SaisieRpn {

  private CommandFactory cf;
  private Scanner scan;
  private MoteurRpn rpn;

  /**
   * Constructeur Saisie.
   * @param rpn moteur
   */
  public SaisieRpn(MoteurRpn rpn) {
    this.scan = new Scanner(System.in);
    this.rpn = rpn;
    this.cf = new CommandFactory();
    cf = CommandFactory.init(rpn);
  }

  /**
   * Saisie.
   */
  public void Saisie() {

    String entree = new String();
    entree = this.scan.next();

    if (entree.matches("\\p{Digit}+")
        || entree.matches("-\\p{Digit}+")
        || entree.matches("\\p{Digit}+.\\p{Digit}")
        || entree.matches("-\\p{Digit}+.\\p{Digit}+")) {

      this.cf.setValeur(Double.parseDouble(entree));
      this.cf.executeCommand("Enregistrer");
    } else if (entree.equals("+")) {
      this.cf.setOperateur(Operation.PLUS);
      this.cf.executeCommand("Operation");
    } else if (entree.equals("-")) {
      this.cf.setOperateur(Operation.MOINS);
      this.cf.executeCommand("Operation");
    } else if (entree.equals("*")) {
      this.cf.setOperateur(Operation.MULT);
      this.cf.executeCommand("Operation");
    } else if (entree.equals("/")) {
      this.cf.setOperateur(Operation.DIV);
      this.cf.executeCommand("Operation");
    } else {
      this.cf.executeCommand(entree);
    }
  }
}
