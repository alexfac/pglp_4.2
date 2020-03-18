package uvsq21603110.Command;

import uvsq21603110.Commande;
import uvsq21603110.MoteurRPN;

public class Return_Command implements Commande {

    private MoteurRPN rpn;

    public Return_Command(MoteurRPN rpn){
        this.rpn = rpn;
    }

    @Override
    public void apply() {
        this.rpn.retourner();
    }
}
