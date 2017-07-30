package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.ExpressionImp;
import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;
import de.hamburg.PJ.token.PJMinus;
import de.hamburg.PJ.token.PJNumer;
import de.hamburg.PJ.token.PJPlus;

public interface PJVisitor {
    void visit(ExpressionImp model);
    void visit(OperandExpression model);
    void visit(OperatorExpression model);
}
