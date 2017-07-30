package de.hamburg.PJ.expression;

import de.hamburg.PJ.visitor.PJVisitor;

public final class ExpressionImp extends Expression{
    @Override
    void accept(PJVisitor pjVisitor) {
        pjVisitor.visit(this);
    }
}
