package de.hamburg.PJ.expression;

import de.hamburg.PJ.visitor.PJVisitor;

public final class OperandExpression extends Expression{
    @Override
    void accept(PJVisitor pjVisitor) {
        pjVisitor.visit(this);
    }
}
