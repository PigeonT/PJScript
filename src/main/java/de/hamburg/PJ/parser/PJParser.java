package de.hamburg.PJ.parser;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.expression.ExpressionImp;
import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;
import de.hamburg.PJ.token.PJToken;
import de.hamburg.PJ.visitor.PJVisitor;

import java.util.List;
import java.util.Stack;

public final class PJParser {
    private Stack<Expression<PJVisitor>> stack = new Stack<>();

    public Expression<PJVisitor> ast(List<PJToken<PJVisitor>> tokens) {
        PJToken<PJVisitor> m;
        for(int i = 0; i < tokens.size(); i++) {
            m = tokens.get(i);
            switch(m.getTokenType()) {
                case NUM:
                    parseNumber(m);
                    break;
                case PLUS:
                case MINUS:
                    Expression<PJVisitor> l = stack.pop();
                    OperatorExpression op = new OperatorExpression(m);
                    i++;
                    Expression<PJVisitor> r = new OperandExpression(tokens.get(i));
                    ExpressionImp exp = new ExpressionImp(l, r, op);
                    stack.push(exp);
                    break;
                default:
                    throw new RuntimeException("Not Valid Token Found, check yoru BNF grammer");
            }
        }
        return stack.pop();
    }

    private void parseNumber(PJToken<PJVisitor> m) {
        stack.push(new OperandExpression(m));
    }
}
