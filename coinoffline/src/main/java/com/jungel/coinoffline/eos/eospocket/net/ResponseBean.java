package com.jungel.coinoffline.eos.eospocket.net;

import java.io.Serializable;

/**
 * Created by pocketEos on 2018/4/2.
 */


public class ResponseBean<T> implements Serializable {

    public int code;
    public String message;
    public T data = null;

}