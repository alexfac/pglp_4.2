package uvsq21603110;

public class CalculatriceRPN
{
    public static void main( String[] args ) {

        MoteurRPN mrpn = new MoteurRPN();
        SaisieRPN s = new SaisieRPN(mrpn);
        while(true) {

            s.Saisie();
        }
    }
}
