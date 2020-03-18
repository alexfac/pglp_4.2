package uvsq21603110;

public class MoteurRPN extends Interpreteur{

    public final static double Max_Value = 99999999;
    public final static double Min_Value = 0;

    public MoteurRPN(){
        super();
    }

    public void enregistrer(double op1){

        if ( Math.abs(op1) < Max_Value && Math.abs(op1) >= Min_Value) {

            pile.push(op1);
            printPile();
            System.out.println();
        }
        else System.out.println("non ajoute à la pile");
    }

    public void printPile(){
        if (pile.size() >= 1){
            for(double elemPile: pile){
                System.out.print(elemPile);
                System.out.print(" ~ ");
            }
        }
        else System.out.println("Pile vide");
    }
}
