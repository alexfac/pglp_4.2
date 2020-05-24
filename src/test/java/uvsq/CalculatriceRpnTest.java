package uvsq;

import org.junit.Test;
import uvsq.command.OperationCommand;
import uvsq.command.RegisterCommand;
import uvsq.command.ReturnCommand;

import static org.junit.Assert.*;

public class CalculatriceRpnTest
{
    @Test
    public void addOperande(){
        MoteurRpn rpn = new MoteurRpn();
        rpn.enregistrer(1);
        assertTrue(rpn.pile.pop() == 1);
    }
    @Test
    public void AddCommand(){
        MoteurRpn rpn = new MoteurRpn();
        RegisterCommand rc = new RegisterCommand(rpn, 1);
        rc.apply();
    }

    @Test
    public void Operation(){
        MoteurRpn rpn = new MoteurRpn();
        rpn.enregistrer(1);
        rpn.enregistrer(2);
        rpn.operation(Operation.PLUS);
        assertTrue(rpn.pile.pop() == 3);
    }

    @Test
    public void OperationCommand(){
        MoteurRpn rpn = new MoteurRpn();
        rpn.enregistrer(1);
        rpn.enregistrer(2);
        OperationCommand opc = new OperationCommand(rpn, Operation.PLUS);
        opc.apply();
    }

    @Test
    public void ReturnCommand(){
        MoteurRpn rpn = new MoteurRpn();
        rpn.enregistrer(1);
        rpn.enregistrer(2);
        ReturnCommand rtc = new ReturnCommand(rpn);
        rtc.apply();

    }
}
