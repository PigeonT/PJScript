package de.hamburg.PJ.expression;

import de.hamburg.PJ.token.PJToken;
import de.hamburg.PJ.visitor.PJVisitor;

public final class OperatorExpression extends Expression<PJVisitor> {
    private final PJToken<PJVisitor> signToken;
    public OperatorExpression(PJToken<PJVisitor> sign) {
        this.signToken = sign;
    }

    @Override
    public String toString() {
        return "OperatorExpression{" +
                "signToken=" + signToken +
                '}';
    }
}
