package de.hamburg.PJ.vm;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.visitor.PJVisitor;

import java.util.Stack;

public final class PJPrefixVisitorVM extends VM<Expression<PJVisitor>>{

    public PJPrefixVisitorVM() {
        super();
    }

    @Override
    public void run(Stack<IR> irStack, Stack<Integer> stack) {

    }
}
