package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.expression.ExpressionImp;
import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;

public abstract class AbstractPJVisitor implements PJVisitor{
    protected Expression<PJVisitor> ast;

    protected AbstractPJVisitor(Expression<PJVisitor> ast) {
        this.ast = ast;
    }

    @Override
    public void visit(Expression<PJVisitor> exp) {
        if (exp instanceof ExpressionImp) visitExpressionImp(exp);
        else if (exp instanceof OperatorExpression) visitOperatorExpression(exp);
        else if (exp instanceof OperandExpression) visitOperandExpression(exp);
        else throw new RuntimeException("Can't evaluate AST correctly, check visitor visit() for more detauls");
    }

    protected abstract void visitExpressionImp(Expression<PJVisitor> exp);
    protected abstract void visitOperatorExpression(Expression<PJVisitor> exp);
    protected abstract void visitOperandExpression(Expression<PJVisitor> exp);
    protected abstract void generateIR();
    public abstract void eval();

    @Override
    public String toString() {
        return String.format("Ab");
    }
}
