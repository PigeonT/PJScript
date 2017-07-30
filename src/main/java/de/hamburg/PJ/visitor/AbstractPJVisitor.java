package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.expression.ExpressionImp;
import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;

import java.util.Stack;

public abstract class AbstractPJVisitor implements PJVisitor{
    protected Stack<Integer> IR = new Stack<>();

    @Override
    public void visit(Expression<PJVisitor> exp) {
        if (exp instanceof ExpressionImp) visitExpression((ExpressionImp) exp);
        else if (exp instanceof OperatorExpression) visitOperatorExpression((OperatorExpression) exp);
        else if (exp instanceof OperandExpression) visitOperandExpression((OperandExpression) exp);
        else throw new RuntimeException("Can't evaluate AST correctly, check visitor visit() for more detauls");
    }

    protected abstract void visitExpression(ExpressionImp exp);
    protected abstract void visitOperatorExpression(OperatorExpression exp);
    protected abstract void visitOperandExpression(OperandExpression exp);

    @Override
    public String toString() {
        return String.format("IR stack: %s", IR);
    }
}
