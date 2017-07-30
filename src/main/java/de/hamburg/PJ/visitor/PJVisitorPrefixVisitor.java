package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.Expression;

public final class PJVisitorPrefixVisitor extends AbstractPJVisitor {

    public PJVisitorPrefixVisitor(Expression<PJVisitor> ast) {
        super(ast);
    }

    @Override
    protected void visitExpressionImp(Expression<PJVisitor> exp) {

    }

    @Override
    protected void visitOperatorExpression(Expression<PJVisitor> exp) {

    }

    @Override
    protected void visitOperandExpression(Expression<PJVisitor> exp) {

    }

    @Override
    protected void generateIR() {

    }

    @Override
    public void eval() {

    }
}
