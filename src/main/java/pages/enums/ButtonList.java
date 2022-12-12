package pages.enums;

public enum ButtonList {
    ZERO('0'), ONE('1'), TWO('2'), THREE('3'), FOUR('4'),
    FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), NINE('9'),
    PLUS('+'), MINUS('-'), MULTIPLY('*'), DIVIDE('/'), PERCENTAGE('%'),
    PARENTL('('), PARENTR(')'),  EQUAL('='), SEPARATOR('.'),
    CLEAR('c'), DELETE('d');
    private char value;

    ButtonList(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
