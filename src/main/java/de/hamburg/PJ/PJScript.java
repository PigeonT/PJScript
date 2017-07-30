package de.hamburg.PJ;

import de.hamburg.PJ.lexer.PJLexer;
import de.hamburg.PJ.model.PJModel;
import de.hamburg.PJ.parser.PJParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public final class PJScript {
    private final static String path = "script.txt";
    public static void main(String[] args) {
        try {
            String input = String.join("\n", Files.readAllLines(Paths.get(path)));
            List<PJModel> tokens = new PJLexer(input).lex();
            new PJParser().ast(tokens);
        } catch (IOException e) {
            System.err.println("File not found: " + e);
        }
    }
}
