package uvsq21603110;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private final Map<String, Commande> commands;

    private CommandFactory(){
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


}
