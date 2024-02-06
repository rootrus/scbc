package com.thunderhead.android.domain.state;

public final class IllegalReducerDispatchException extends Exception {
    public IllegalReducerDispatchException() {
        super("Reducers may not dispatch actions.");
    }
}
