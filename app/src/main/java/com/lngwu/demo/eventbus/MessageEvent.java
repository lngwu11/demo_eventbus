package com.lngwu.demo.eventbus;

/**
 * Created by Administrator on 2017/1/16.
 */

public class MessageEvent {

    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
