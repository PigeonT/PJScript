package de.hamburg.PJ.token;

import de.hamburg.PJ.visitor.PJVisitor;

public class PJPlus extends PJToken<PJVisitor> {
    public PJPlus(PJTokenType t) {
        super(t);
    }

    @Override
    public String toString() {
        return "PJPlus{" +
                "tokenType=" + tokenType.name() +
                '}';
    }
}
