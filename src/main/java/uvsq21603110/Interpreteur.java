package uvsq21603110;

import java.util.Stack;

public class Interpreteur {
    private Stack<Integer> pile;

    public Interpreteur(){
        this.pile = new Stack<Integer>();
    }

    public void exit(){
        System.exit(0);
    }

    public void undo(){
        this.pile.pop();
    }
}
