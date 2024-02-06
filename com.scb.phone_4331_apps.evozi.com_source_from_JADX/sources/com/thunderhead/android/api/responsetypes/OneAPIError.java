package com.thunderhead.android.api.responsetypes;

import p040o.onGetStartedClick;

public final class OneAPIError extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneAPIError(String str) {
        super(str);
        onGetStartedClick.write((Object) str, "errorMessage");
    }
}
