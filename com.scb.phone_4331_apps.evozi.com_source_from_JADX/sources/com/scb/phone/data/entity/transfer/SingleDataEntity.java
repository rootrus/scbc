package com.scb.phone.data.entity.transfer;

import com.google.gson.annotations.SerializedName;
import p040o.setCurrentItemInternal;
import p040o.setOnPageChangeListener;

public class SingleDataEntity<T> extends setCurrentItemInternal {
    @SerializedName("data")
    private T data;

    public SingleDataEntity() {
    }

    public SingleDataEntity(setOnPageChangeListener setonpagechangelistener, T t) {
        super(setonpagechangelistener);
        this.data = t;
    }

    public T getData() {
        return this.data;
    }
}
