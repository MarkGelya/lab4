package Persons;

public enum Status{
    NORMAL("NORMAL", "..."),
    STORYTELLER("выдумщик", "..."),
    FOOL("дурачок", "..."),
    CRAZY("сумасшедший", "Сумасшедшие всегда воображают себя какими-нибудь великими личностями, знаменитостями или отважными путешественниками."),
    MADMAN("сошёл с ума", "..."),
    ALIEN("прилител с другой ланеты", "..."),
    DIRTY_HANDS("грязные руки", "..."),
    DIRTY_FACE("грязное лицо", "..."),
    AFRAID("готов к защите", "...");
    private String description;
    private String asString;
    Status(String asString, String description) {
        this.description = description;
        this.asString = asString;
    }
    @Override
    public String toString() {
        return asString;
    }
    public String getDescription() {
        return description;
    }
}
