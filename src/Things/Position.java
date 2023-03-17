package Things;

public enum Position{
    NONE("NONE"),
    AROUND("AROUND"),
    CENTER("CENTER");
    private String asString;
    Position(String asString) {
        this.asString = asString;
    }
    @Override
    public String toString() {
        return asString;
    }
}
