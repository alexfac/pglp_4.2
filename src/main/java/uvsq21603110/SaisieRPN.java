package uvsq21603110;

import uvsq21603110.Command.Register_Command;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class SaisieRPN {

  private CommandFactory cf;
  private Scanner scan;
  private MoteurRPN rpn;

  public SaisieRPN(MoteurRPN rpn) {
    this.scan = new Scanner(System.in);
    this.rpn = rpn;
    this.cf = new CommandFactory();
    cf = CommandFactory.init(rpn);
  }

  public void Saisie() {

    String entree = new String();
    entree = this.scan.next();

    if (entree.matches("\\p{Digit}+")
        || entree.matches("-\\p{Digit}+")
        || entree.matches("\\p{Digit}+.\\p{Digit}")
        || entree.matches("-\\p{Digit}+.\\p{Digit}+")) {

      this.cf.setValeur(Double.parseDouble(entree));
      this.cf.executeCommand("Enregistrer");
    }
    // CETTE PARTIE PEUT ETRE AMELIORER
    else if (entree.equals("+")) {
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
    } else this.cf.executeCommand(entree);
  }
}
