package de.hamburg.PJ.token;

public class PJPlus implements PJToken {
    private final PJTokenType token;

    public PJPlus(PJTokenType t) {
        this.token = t;
    }

    @Override
    public String toString() {
        return "PJPlus{" +
                "token=" + token.name() +
                '}';
    }
}
