package com.agathe;

public enum Language {
    ENGLISH("Hello World!!!!"),
    FRENCH("Bonjour le monde :)"),
    ;

    private final String greeting;

    Language(final String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return this.greeting;
    }
}
