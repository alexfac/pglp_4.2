package uvsq21603110;

import uvsq21603110.Command.*;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private final Map<String, Commande> commands;

    public CommandFactory(){

        this.commands = new HashMap<>();
    }

    public void addCommands(String name, Commande commande){
        this.commands.put(name, commande);
    }

    public void executeCommand(String name){
        if (this.commands.containsKey(name)){
            this.commands.get(name).apply();
        }
    }

    public static CommandFactory init(MoteurRPN rpn){
        CommandFactory cf = new CommandFactory();
        cf.addCommands("exit", new Exit_Command(rpn));
        cf.addCommands("undo", new Undo_Command(rpn));
        cf.addCommands("Enregistrer", new Register_Command(rpn, 0));
        cf.addCommands("Operation", new Operation_Command(rpn, Operation.PLUS));
        cf.addCommands("Retourner", new Return_Command(rpn));
        return cf;
    }

    public void setValeur(double valeur){
        Register_Command rc;
        if (this.commands.containsKey("Enregistrer")){
            rc = (Register_Command)this.commands.get("Enregistrer");
            rc.registerValeur(valeur);
        }
    }

    public void setOperateur(Operation op){
        Operation_Command oc;
        if (this.commands.containsKey("Operation")){
            oc = (Operation_Command)this.commands.get("Operation");
            oc.registerOperateur(op);
        }
    }
}
