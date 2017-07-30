package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.ExpressionImp;
import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;

public final class PJVisitorPrefixVisitor extends AbstractPJVisitor {

    public PJVisitorPrefixVisitor(){}


    @Override
    public void eval() {

    }

    @Override
    protected void visitExpression(ExpressionImp exp) {
        if(exp.hasLH()) super.visit(exp);
        if(exp.hasRH()) super.visit(exp);
     }

    @Override
    protected void visitOperatorExpression(OperatorExpression exp) {

    }

    @Override
    protected void visitOperandExpression(OperandExpression exp) {

    }
}
