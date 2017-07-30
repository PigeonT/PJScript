package de.hamburg.PJ.expression;

import de.hamburg.PJ.visitor.PJVisitor;

public abstract class Expression<V extends PJVisitor> {
    abstract void accept(V v);
}
