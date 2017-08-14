package de.hamburg.PJ.vm;

import de.hamburg.PJ.expression.Expression;
import de.hamburg.PJ.visitor.PJVisitor;

import java.util.Stack;

public abstract class VM<V extends Expression<PJVisitor>> {

    protected Stack<IR> irStack;
    protected Stack<Integer> stack;

    VM() {}

    public abstract void run(Stack<IR> irStack, Stack<Integer> stack);
}
