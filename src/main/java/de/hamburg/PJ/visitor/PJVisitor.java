package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.Expression;

public interface PJVisitor {
    void visit(Expression<PJVisitor> vExpression);
}
