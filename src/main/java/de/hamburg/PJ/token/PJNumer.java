package de.hamburg.PJ.token;

public class PJNumer implements PJToken {

    private final int value;
    private final PJTokenType token = PJTokenType.NUM;

    public PJNumer(int n) {
        this.value = n;
    }
    public int getValue() {
        return value;
    }

    public PJTokenType getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "PJNumer{" +
                "value=" + value +
                ", token=" + token.name() +
                '}';
    }
}
