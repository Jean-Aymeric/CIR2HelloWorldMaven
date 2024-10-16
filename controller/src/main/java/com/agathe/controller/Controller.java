package com.agathe.controller;

import com.agathe.IController;
import com.agathe.IModel;
import com.agathe.IView;

public class Controller implements IController {

    private IView view;
    private IModel model;

    @Override
    public void start() {
        this.view.displayMessage(this.model.getMessage());
    }

    @Override
    public void stop() {

    }

    @Override
    public IView getView() {
        return this.view;
    }

    @Override
    public void setView(final IView view) {
        this.view = view;
    }

    @Override
    public IModel getModel() {
        return this.model;
    }

    @Override
    public void setModel(final IModel model) {
        this.model = model;
    }
}
