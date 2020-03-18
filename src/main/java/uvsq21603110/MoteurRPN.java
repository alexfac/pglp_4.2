package uvsq21603110;

import java.util.Stack;

public class MoteurRPN extends Interpreteur{

    public final static double Max_Value = 99999999;
    public final static double Min_Value = 0;

    public MoteurRPN(){

        super();
    }

    public void enregistrer(double op1){

        if ( Math.abs(op1) < Max_Value && Math.abs(op1) >= Min_Value) {

            pile.push(op1);
        }
        else System.out.println("non ajoute à la pile");
    }

    public void operation(Operation op){

        double elem = 0;
        if (pile.size() >= 2){
            elem = op.eval(pile.pop(), pile.pop());
        }
        pile.push(elem);
    }

    public Stack<Double> retourner(){

        return this.pile;
    }
}
