package uvsq;

import java.util.HashMap;
import java.util.Map;
import uvsq.command.ExitCommand;
import uvsq.command.OperationCommand;
import uvsq.command.RegisterCommand;
import uvsq.command.ReturnCommand;
import uvsq.command.UndoCommand;

public class CommandFactory {

  private final Map<String, Commande> commands;

  public CommandFactory() {

    this.commands = new HashMap<>();
  }

  public void addCommands(String name, Commande commande) {
    this.commands.put(name, commande);
  }

  /**
   * Exectue les commandes.
   * @param name nom commande
   */
  public void executeCommand(String name) {
    if (this.commands.containsKey(name)) {
      this.commands.get(name).apply();
    }
  }

  /**
   * init command factory.
   * @param rpn moteur
   * @return commandfactory
   */
  public static CommandFactory init(MoteurRpn rpn) {
    CommandFactory cf = new CommandFactory();
    cf.addCommands("exit", new ExitCommand(rpn));
    cf.addCommands("undo", new UndoCommand(rpn));
    cf.addCommands("Enregistrer", new RegisterCommand(rpn, 0));
    cf.addCommands("Operation", new OperationCommand(rpn, Operation.PLUS));
    cf.addCommands("Retourner", new ReturnCommand(rpn));
    return cf;
  }

  /**
   * Remplis la valeur.
   * @param valeur valeur
   */
  public void setValeur(double valeur) {
    RegisterCommand rc;
    if (this.commands.containsKey("Enregistrer")) {
      rc = (RegisterCommand) this.commands.get("Enregistrer");
      rc.registerValeur(valeur);
    }
  }

  /**
   * remplis l'operateur.
   * @param op operation
   */
  public void setOperateur(Operation op) {
    OperationCommand oc;
    if (this.commands.containsKey("Operation")) {
      oc = (OperationCommand) this.commands.get("Operation");
      oc.registerOperateur(op);
    }
  }
}
