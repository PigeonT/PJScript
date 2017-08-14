package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.vm.VM;

public interface PJVisitor {
    void visit(Expression<PJVisitor> vExpression);
    void eval(VM vm);
}
