package de.hamburg.PJ.expression;

import de.hamburg.PJ.visitor.PJVisitor;

public final class ExpressionImp extends Expression<PJVisitor>{
    private final Expression<PJVisitor> lop;
    private final Expression<PJVisitor> rop;
    private final OperatorExpression signToken;
    public ExpressionImp(Expression<PJVisitor> l, Expression<PJVisitor> r, OperatorExpression sign) {
        this.lop = l;
        this.rop = r;
        this.signToken = sign;
    }

    public boolean hasLH() {
        return lop != null;
    }

    public boolean hasRH() {
        return rop != null;
    }

    public boolean LHIsOperator() {
        return !(lop instanceof OperandExpression);
    }
    @Override
    public String toString() {
        return String.format("lop: %s\n operator: %s\n rop: %s\n",
                this.lop, this.signToken, this.rop);
    }
    public Expression<PJVisitor> getLop() {
        return lop;
    }

    public Expression<PJVisitor> getRop() {
        return rop;
    }

    public OperatorExpression getSignToken() {
        return signToken;
    }
}
