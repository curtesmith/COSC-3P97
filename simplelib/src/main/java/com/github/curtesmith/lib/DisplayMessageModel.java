package com.github.curtesmith.lib;

import java.util.Observable;

/**
 * Created by Curtis on 2015-09-21.
 */
public class DisplayMessageModel extends Observable {
    String mMessage;

    public DisplayMessageModel() {}

    public void setMessage(String message) {
        mMessage = message;
        setChanged();
        notifyObservers();
    }

    public String getmMessage() {
        return mMessage;
    }
}
