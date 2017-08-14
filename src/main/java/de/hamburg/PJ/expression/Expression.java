package de.hamburg.PJ.expression;

import de.hamburg.PJ.visitor.PJVisitor;

public abstract class Expression<V extends PJVisitor> {

    @SuppressWarnings("unchecked")
    void accept(V v) {
        v.visit((Expression<PJVisitor>) this);
    };

}
