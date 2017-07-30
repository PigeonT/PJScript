package de.hamburg.PJ.token;

import de.hamburg.PJ.visitor.PJVisitor;

public class PJMinus extends PJToken<PJVisitor> {

    public PJMinus(PJTokenType t) {
        super(t);
    }

    @Override
    public String toString() {
        return "PJMinus{" +
                "tokenType=" + tokenType.name() +
                '}';
    }
}
