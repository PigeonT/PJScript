package de.hamburg.PJ.visitor;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.expression.ExpressionImp;
import de.hamburg.PJ.expression.OperandExpression;
import de.hamburg.PJ.expression.OperatorExpression;
import de.hamburg.PJ.vm.IR;
import de.hamburg.PJ.vm.VM;

import java.util.Stack;

public abstract class AbstractPJVisitor implements PJVisitor{
    protected Stack<IR> irStack = new Stack<>();
    protected final Stack<Integer> stack = new Stack<>();


    @Override
    public void eval(VM vm) {
        vm.run(this.irStack, this.stack);
    }
    @Override
    public void visit(Expression<PJVisitor> exp) {
        if (exp instanceof ExpressionImp) visitExpression((ExpressionImp) exp);
        else if (exp instanceof OperandExpression) visitOperandExpression((OperandExpression) exp);
        else throw new RuntimeException("Can't evaluate AST correctly, check visitor visit() for more detauls");
    }

    protected abstract void visitExpression(ExpressionImp exp);
    protected abstract void visitOperandExpression(OperandExpression exp);

    @Override
    public String toString() {
        return String.format("irStack stack: %s", irStack);
    }
}
