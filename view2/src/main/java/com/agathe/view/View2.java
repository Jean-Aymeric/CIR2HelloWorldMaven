package com.agathe.view;

import com.agathe.IView;

import javax.swing.*;

public class View2 implements IView {
    @Override
    public void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
