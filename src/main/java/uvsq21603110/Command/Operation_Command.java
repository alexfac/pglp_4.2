package uvsq21603110.Command;

import uvsq21603110.Commande;
import uvsq21603110.MoteurRPN;
import uvsq21603110.Operation;

public class Operation_Command implements Commande {

    private MoteurRPN rpn;
    private Operation op;

    public Operation_Command(MoteurRPN rpn, Operation op){

        this.rpn = rpn;
        this.op = op;
    }

    @Override
    public void apply() {

        double res = 0;
        if (this.rpn.pile.size() >= 2) {

            res = op.eval(this.rpn.pile.pop(), this.rpn.pile.pop());
            this.rpn.enregistrer(res);
        }else System.out.println("Pas assez d'operandes");
    }
}
