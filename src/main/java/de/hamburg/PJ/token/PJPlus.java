package de.hamburg.PJ.token;

public class PJPlus extends PJToken {
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
