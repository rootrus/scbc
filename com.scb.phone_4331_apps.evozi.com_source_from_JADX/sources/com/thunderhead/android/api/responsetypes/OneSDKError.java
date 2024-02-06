package com.thunderhead.android.api.responsetypes;

import p040o.onGetStartedClick;

public final class OneSDKError extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneSDKError(String str) {
        super(str);
        onGetStartedClick.write((Object) str, "errorMessage");
    }
}
