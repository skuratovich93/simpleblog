package com.simpleblog.domain;

import java.io.Serializable;

/**
 * @author y.skuratovich
 * @version 29.03.2016
 */
public class Blog implements Serializable {

    private String message = "MESSAGE";

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

}
