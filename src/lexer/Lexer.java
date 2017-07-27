package lexer;

import java.io.IOException;
import java.util.Scanner;

public final class Lexer {
    private final String input;
    public Lexer(String input) {
        this.input = input;
    }

    public void lex() throws IOException {

        for(char c : input.toCharArray()) {
            //TODO lexer implementation 
//            switch(c) {
//                case '\n':
//                case ' ': {
//                    System.out.println('A');
//                }
//                default:
//                    System.out.println("default");
//            }

        }
    }
}
