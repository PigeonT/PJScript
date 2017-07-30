package de.hamburg.PJ.token;

public class PJNumer extends PJToken {

    private final int value;
    private final PJTokenType token = PJTokenType.NUM;

    public PJNumer(int n) {
        super(PJTokenType.NUM);
        this.value = n;
    }
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PJNumer{" +
                "value=" + value +
                ", tokenType=" + tokenType.name() +
                '}';
    }
}
