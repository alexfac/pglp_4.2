package uvsq;

public enum Operation {
  PLUS('+') {
    public double eval(double op1, double op2) {
      return op1 + op2;
    }
  },
  MOINS('-') {
    public double eval(double op1, double op2) {

      return op1 - op2;
    }
  },
  MULT('*') {
    public double eval(double op1, double op2) {

      return op1 * op2;
    }
  },
  DIV('/') {
    /**
     * evaluation.
     * @param op1 operande1
     * @param op2 operande2
     * @return resultat
     * @throws DivisionPar0 exception
     */
    public double eval(double op1, double op2) throws DivisionPar0 {
      if (op1 == 0) {
        throw new DivisionPar0();
      } else {
        return op2 / op1;
      }
    }
  },
  ;

  private char symbole;

  Operation(char symbole) {
    this.symbole = symbole;
  }

  public char getSymbole() {
    return this.symbole;
  }

  public abstract double eval(double op1, double op2) throws DivisionPar0;
}
