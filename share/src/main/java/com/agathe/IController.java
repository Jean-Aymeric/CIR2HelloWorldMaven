package com.agathe;

public interface IController {

    void start();

    void stop();

    IView getView();

    void setView(IView view);

    IModel getModel();

    void setModel(IModel model);

}
