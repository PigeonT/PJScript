package de.hamburg.PJ.token;

public class PJMinus implements PJToken {
    private final PJTokenType token;

    public PJMinus(PJTokenType t) {
        this.token = t;
    }

    @Override
    public String toString() {
        return "PJMinus{" +
                "token=" + token.name() +
                '}';
    }
}
