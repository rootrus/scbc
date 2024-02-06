package com.thunderhead.connectivity;

public interface NetworkOperationCallback<T> {
    void onFailure(NetworkOperationError networkOperationError);

    void onSuccess(T t);
}
