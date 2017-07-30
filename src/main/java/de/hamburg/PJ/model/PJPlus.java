package de.hamburg.PJ.model;

public class PJPlus implements PJModel{
    private final PJToken token;

    public PJPlus(PJToken t) {
        this.token = t;
    }

    @Override
    public String toString() {
        return "PJPlus{" +
                "token=" + token.name() +
                '}';
    }
}
