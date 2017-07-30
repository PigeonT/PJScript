package de.hamburg.PJ.expression;

import de.hamburg.PJ.visitor.PJVisitor;

public final class OperatorExpression extends Expression {
    @Override
    void accept(PJVisitor pjVisitor) {
        pjVisitor.visit(this);
    }
}
