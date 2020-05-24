package uvsq;

enum CalculatriceRpn {
  ENVIRONNEMENT;

  public void run(String[] args) {
    MoteurRpn rpn = new MoteurRpn();
    SaisieRpn s = new SaisieRpn(rpn);
    System.out.println("undo pour retourner en arriere et exit pour quitter");
    while (true) {

      s.Saisie();
      System.out.println(rpn.retourner());
    }
  }

  public static void main(String[] args) {
    ENVIRONNEMENT.run(args);
  }
}
