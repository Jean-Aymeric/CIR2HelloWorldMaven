package com.agathe.view;

import com.agathe.IView;

public class View implements IView {

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

}
