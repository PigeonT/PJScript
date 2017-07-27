public enum Token {
    VAR(0),
    IDENTIFIER(1),
    EQUAL(2),
    FUNC(3),
    LBRACE(4),
    RBRACE(5),
    LBRACKET(6),
    RBRACKET(7),
    SEMICOLON(8);

    private final int id;
    Token(int id) {
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
