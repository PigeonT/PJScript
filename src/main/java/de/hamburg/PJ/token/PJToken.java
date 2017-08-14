package de.hamburg.PJ.token;

import de.hamburg.PJ.visitor.PJVisitor;

public abstract class PJToken<V extends PJVisitor> {

    protected PJTokenType tokenType;

    PJToken(PJTokenType t) {
        this.tokenType = t;
    }

    public PJTokenType getTokenType() {
        return this.tokenType;
    }
}
