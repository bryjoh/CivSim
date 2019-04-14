package com.stormy.studios.screen;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public interface Screen {

    void displayOutput(AsciiPanel panel);

    Screen reactToInput(KeyEvent key);
}