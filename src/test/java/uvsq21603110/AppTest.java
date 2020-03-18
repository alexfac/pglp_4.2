package uvsq21603110;

import org.junit.Test;
import uvsq21603110.Command.Operation_Command;
import uvsq21603110.Command.Register_Command;
import uvsq21603110.Command.Return_Command;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest 
{
    @Test
    public void addOperande(){
        MoteurRPN rpn = new MoteurRPN();
        rpn.enregistrer(1);
        assertTrue(rpn.pile.pop() == 1);
    }
    @Test
    public void AddCommand(){
        MoteurRPN rpn = new MoteurRPN();
        Register_Command rc = new Register_Command(rpn, 1);
        rc.apply();
    }

    @Test
    public void Operation(){
        MoteurRPN rpn = new MoteurRPN();
        rpn.enregistrer(1);
        rpn.enregistrer(2);
        rpn.operation(Operation.PLUS);
        assertTrue(rpn.pile.pop() == 3);
    }

    @Test
    public void OperationCommand(){
        MoteurRPN rpn = new MoteurRPN();
        rpn.enregistrer(1);
        rpn.enregistrer(2);
        Operation_Command opc = new Operation_Command(rpn, Operation.PLUS);
        opc.apply();
    }

    @Test
    public void ReturnCommand(){
        MoteurRPN rpn = new MoteurRPN();
        rpn.enregistrer(1);
        rpn.enregistrer(2);
        Return_Command rtc = new Return_Command(rpn);
        rtc.apply();

    }
}
