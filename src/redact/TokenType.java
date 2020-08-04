package redact;

public enum TokenType {
    // Single-character tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    MINUS, PLUS, SEMICOLON, DIVIDE, MULTIPLY, MODULUS, COMMA, DOT,

    // One or two character tokens.
    NOT, NOT_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literals.
    IDENTIFIER, STRING, NUMBER,

    // Keywords.
    AND, ELSE, ELIF, FALSE, FUNC, LOOP, FROM, IF, NULL, OR,
    PRINT, RETURN, TRUE, LET, WHILE, CONST, BEGIN, END,

    EOF
}