package de.hamburg.PJ;

import de.hamburg.PJ.lexer.PJLexer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class PJScript {
    private final static String path = "script.txt";
    public static void main(String[] args) {
        try {
            String input = String.join("\n", Files.readAllLines(Paths.get(path)));
            new PJLexer(input).lex();
        } catch (IOException e) {
            System.err.println("File not found: " + e);
        }
    }
}
