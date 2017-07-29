package de.hamburg.PJ.model;

public enum PJToken {
    NUM(0),
    MINUS(1),
    PLUS(2);

    private final int id;
    PJToken(int id) {
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
