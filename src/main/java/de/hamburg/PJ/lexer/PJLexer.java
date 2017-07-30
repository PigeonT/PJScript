package de.hamburg.PJ.lexer;

import de.hamburg.PJ.token.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class PJLexer {
    private final String input;
    private final char[] arr;
    private int index = 0;
    private List<PJToken> tokens = new ArrayList<>();

    public PJLexer(String input) {
        this.input = input;
        arr = this.input.toCharArray();
    }

    public List<PJToken> lex() throws IOException {
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
        return tokens;
    }

    public List<PJToken> getTokens() {
        return this.tokens;
    }

    private void getDigit() {
        tokens.add(new PJNumer(Character.getNumericValue(arr[index])));
    }

    private void getPlusSign() {
        tokens.add(new PJPlus(PJTokenType.PLUS));
    }

    private void getMinusSign() {
        tokens.add(new PJMinus(PJTokenType.MINUS));
    }

}
