package de.hamburg.PJ.lexer;

import de.hamburg.PJ.model.PJModel;
import de.hamburg.PJ.model.PJString;
import de.hamburg.PJ.model.PJToken;

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
                case '\n':
                case ' ': {
                    index++;
                    continue;
                }
                case '\"':
                    stringToken();
                    break;
                case '{':
                    LBlockToken();
                case '}':
                    RBlockToken();
                default:
                    System.out.print(arr[index] + " ");
                    System.out.println(index);
                    index++;
            }

        }
        for(PJModel j : tokens) {
            System.out.println(j);
        }
    }

    private void RBlockToken() {
        //todo

    }

    private void LBlockToken() {
        //todo

    }

    private void stringToken() {
        index++;
        char c;
        StringBuilder sb = new StringBuilder();
        while((c = arr[index]) != '\"') {
            sb.append(c);
            index++;
        }
        tokens.add(new PJString(PJToken.STRING, sb.toString()));
        index++;
    }

}
