package de.hamburg.PJ.parser;

import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;
import de.hamburg.PJ.token.PJToken;

import java.util.List;

public final class PJParser {
    public void ast(List<PJToken> tokens) {
        for(PJToken m : tokens) {
            switch(m.getTokenType()) {
                case NUM:
                    parseNumber();
                    break;
                case PLUS:
                    parsePlusSign();
                    break;
                case MINUS:
                    parseMinusSign();
                    break;
                default:
                    throw new RuntimeException("Not Valid Token Found, check yoru BNF grammer");
            }
        }
    }

    private void parseMinusSign() {

    }

    private void parsePlusSign() {

    }

    private void parseNumber() {

    }
}
