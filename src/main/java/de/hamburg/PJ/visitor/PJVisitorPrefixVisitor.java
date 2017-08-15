package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.expression.ExpressionImp;
import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;
import de.hamburg.PJ.token.PJNumer;
import de.hamburg.PJ.token.PJToken;
import de.hamburg.PJ.vm.IR;
import de.hamburg.PJ.vm.VM;

import static de.hamburg.PJ.vm.IR.*;

import java.util.Stack;

public final class PJVisitorPrefixVisitor extends AbstractPJVisitor {
    private Stack<Expression<PJVisitor>> pending = new Stack<>();

    public PJVisitorPrefixVisitor(){}

    @Override
    protected void visitExpression(ExpressionImp exp) {
        //TODO handle pending stack to build prefix virtual machine directives
        pending.push(exp);
        if(exp.LHIsOperator()) super.visit(exp.getLop());
        if(exp.RHIsOperator()) super.visit(exp.getRop());
    }

    protected void visitOperatorExpression(OperatorExpression exp) {
        if(isMinusSign(exp)) irStack.push(MINUS);
        if(isPlusSign(exp)) irStack.push(ADD);
    }

    @Override
    protected void visitOperandExpression(OperandExpression exp) {
        irStack.push(pushOperator());
        irStack.push(PUSH);
        stack.push(((PJNumer) exp.getToken()).getValue());
    }

    private IR pushOperator() {
        if(isMinusSign((OperatorExpression) pending.pop())) return MINUS;
        else if(isPlusSign((OperatorExpression) pending.pop())) return ADD;
        else throw new RuntimeException("Not supported Operator with " + pending.pop());
    }

    private boolean isMinusSign(OperatorExpression exp) {
        return exp.getToken().getTokenType().getId() == 1;
    }
    private boolean isPlusSign(OperatorExpression exp) {
        return exp.getToken().getTokenType().getId() == 1;
    }
}
