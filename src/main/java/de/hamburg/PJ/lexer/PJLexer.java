package de.hamburg.PJ.lexer;

import de.hamburg.PJ.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class PJLexer {
    private final String input;
    private final char[] arr;
    private int index = 0;
    private List<PJModel> tokens = new ArrayList<>();

    public PJLexer(String input) {
        this.input = input;
        arr = this.input.toCharArray();
    }

    public void lex() throws IOException {
        while(index <= arr.length - 1) {
            switch(arr[index]) {
                case '+':
                    getPlusSign();
                    index++;
                    break;
                case '-': {
                    getMinusSign();
                    index++;
                    break;
                }
                default:
                    getDigit();
                    index++;
            }

        }
        for(PJModel j : tokens) {
            System.out.println(j);
        }
    }

    private void getDigit() {
        System.out.println("index is: " + index);
        tokens.add(new PJNumer((int) arr[index]));
    }

    private void getPlusSign() {
        tokens.add(new PJPlus(PJToken.PLUS));
    }

    private void getMinusSign() {
        tokens.add(new PJMinus(PJToken.MINUS));
    }

}
