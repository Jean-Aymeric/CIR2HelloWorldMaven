package com.agathe.model;

import com.agathe.IModel;
import com.agathe.Language;

public class Model implements IModel {

    private final Language language;

    public Model(Language language) {
        this.language = language;
    }

    @Override
    public String getMessage() {
        return this.language.getGreeting();
    }
}
