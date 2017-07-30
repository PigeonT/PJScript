package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.expression.ExpressionImp;
import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;

public final class PJVisitorPrefixVisitor implements PJVisitor {
    @Override
    public void visit(Expression exp) {
        if(exp instanceof ExpressionImp) visitExpressionImp();
        else if(exp instanceof OperatorExpression) visitOperatorExpression();
        else if(exp instanceof OperandExpression) visitOperandExpression();
        else throw new RuntimeException("Can't evaluate AST correctly, check visitor visit() for more detauls");
    }

    private void visitOperatorExpression() {

    }

    private void visitOperandExpression() {

    }

    private void visitExpressionImp() {

    }
}
