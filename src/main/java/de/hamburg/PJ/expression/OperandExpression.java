package de.hamburg.PJ.expression;

import de.hamburg.PJ.token.PJToken;
import de.hamburg.PJ.visitor.PJVisitor;

public final class OperandExpression extends Expression<PJVisitor>{
    private final PJToken<PJVisitor> token;
    public OperandExpression(PJToken<PJVisitor> t) {
        this.token = t;
    }

    @Override
    public String toString() {
        return "OperandExpression{" +
                "token=" + token +
                '}';
    }
}
