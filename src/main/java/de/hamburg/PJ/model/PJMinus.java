package de.hamburg.PJ.model;

public class PJMinus implements PJModel{
    private final PJToken token;

    public PJMinus(PJToken t) {
        this.token = t;
    }

    @Override
    public String toString() {
        return "PJMinus{" +
                "token=" + token.name() +
                '}';
    }
}
