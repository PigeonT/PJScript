package de.hamburg.PJ.parser;

import de.hamburg.PJ.token.PJToken;
import de.hamburg.PJ.token.PJTokenType;
import de.hamburg.PJ.visitor.PJVisitor;

import java.util.List;
import java.util.Stack;

public final class PJParser {
    private Stack<PJToken<PJVisitor>> stack = new Stack<>();

    public void ast(List<PJToken<PJVisitor>> tokens) {
        for(PJToken<PJVisitor> m : tokens) {
            switch(m.getTokenType()) {
                case NUM:
                    parseNumber(m);
                    break;
                case PLUS:
                case MINUS:
                    parseOperator(m);
                    break;
                default:
                    throw new RuntimeException("Not Valid Token Found, check yoru BNF grammer");
            }
        }
    }

    private void parseOperator(PJToken<PJVisitor> m) {
        PJToken<PJVisitor> t = stack.peek();
        if(t.getTokenType().equals(PJTokenType.NUM)) {
            //todo
        }
    }

    private void parseNumber(PJToken<PJVisitor> m) {
        stack.push(m);
    }
}
