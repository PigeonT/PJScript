package de.hamburg.PJ.model;

public final class PJString implements PJModel{
    private final PJToken tokenType;
    private final String value;

    public PJString(PJToken t, String v) {
        this.tokenType = t;
        this.value = v;
    }

    public PJToken getTokenType() {
        return tokenType;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Tokentype is: " + tokenType + " and the value is: " + value;
    }
}
