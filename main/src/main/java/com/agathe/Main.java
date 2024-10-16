package com.agathe;

import com.agathe.controller.Controller;
import com.agathe.model.Model;
import com.agathe.view.View2;

public class Main {
    public static void main(String[] args) {
        IModel model = new Model(Language.FRENCH);
        IView view = new View2();
        IController controller = new Controller();
        controller.setModel(model);
        controller.setView(view);
        controller.start();
    }
}
