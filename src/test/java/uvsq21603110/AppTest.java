package uvsq21603110;

import org.junit.Test;
import uvsq21603110.Command.Register_Command;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
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

}
