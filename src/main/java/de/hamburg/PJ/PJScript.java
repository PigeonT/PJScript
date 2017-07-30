package de.hamburg.PJ;


import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.lexer.PJLexer;
import de.hamburg.PJ.parser.PJParser;
import de.hamburg.PJ.token.PJToken;
import de.hamburg.PJ.visitor.AbstractPJVisitor;
import de.hamburg.PJ.visitor.PJVisitor;
import de.hamburg.PJ.visitor.PJVisitorPrefixVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public final class PJScript {
    private final static String path = "script.txt";
    public static void main(String[] args) {
        try {
            String input = String.join("\n", Files.readAllLines(Paths.get(path)));
            List<PJToken<PJVisitor>> tokens = new PJLexer(input).lex();
            Expression<PJVisitor> ast = new PJParser().ast(tokens);
            PJVisitor visitor = new PJVisitorPrefixVisitor();
            visitor.visit(ast);
            visitor.eval();

        } catch (IOException e) {
            System.err.println("File not found: " + e);
        }
    }
}
