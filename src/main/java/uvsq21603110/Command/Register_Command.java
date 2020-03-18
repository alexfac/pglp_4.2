package uvsq21603110.Command;

import uvsq21603110.Commande;
import uvsq21603110.MoteurRPN;

public class Register_Command implements Commande {

    private MoteurRPN rpn;
    private double valeur;

    public Register_Command(MoteurRPN rpn, double valeur){
        this.rpn = rpn;
        this.valeur = valeur;
    }

    public void registerValeur(double valeur){
        this.valeur = valeur;
    }

    @Override
    public void apply() {
        this.rpn.pile.push(valeur);
    }
}
