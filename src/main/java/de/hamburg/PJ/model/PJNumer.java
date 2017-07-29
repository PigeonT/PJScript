package de.hamburg.PJ.model;

public class PJNumer implements PJModel{

    private final int value;
    private final PJToken token = PJToken.NUM;

    public PJNumer(int n) {
        this.value = n;
    }
    public int getValue() {
        return value;
    }

    public PJToken getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "PJNumer{" +
                "value=" + value +
                ", token=" + token +
                '}';
    }
}
