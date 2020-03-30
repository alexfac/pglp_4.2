package uvsq21603110;

enum CalculatriceRPN
{
    ENVIRONNEMENT;

    public void run(String[] args){
        MoteurRPN rpn = new MoteurRPN();
        SaisieRPN s = new SaisieRPN(rpn);
        System.out.println("undo pour retourner en arriere et exit pour quitter");
        while(true) {

            s.Saisie();
            System.out.println(rpn.retourner());
        }
    }

    public static void main( String[] args ) {
        ENVIRONNEMENT.run(args);
    }
}
