package de.hamburg.PJ.token;

public class PJMinus extends PJToken {

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
