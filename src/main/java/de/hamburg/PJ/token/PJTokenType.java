package de.hamburg.PJ.token;

public enum PJTokenType {
    NUM(0),
    MINUS(1),
    PLUS(2);

    private final int id;
    PJTokenType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Token id is: " + id;
    }


}
