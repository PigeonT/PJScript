package de.hamburg.PJ.model;

public enum PJToken {
    STRING(0),
    IDENTIFIER(1),
    FUNC(2),
    LBRACE(3),
    RBRACE(4),
    LBRACKET(5),
    RBRACKET(6);

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
