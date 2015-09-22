package com.github.curtesmith.lib;

import java.util.Observable;

public class DisplayMessageModel extends Observable {
    String mMessage;

    public DisplayMessageModel() {}

    public void setMessage(String message) {
        mMessage = message;
        setChanged();
        notifyObservers();
    }

    public String getMessage() {
        return mMessage;
    }
}
