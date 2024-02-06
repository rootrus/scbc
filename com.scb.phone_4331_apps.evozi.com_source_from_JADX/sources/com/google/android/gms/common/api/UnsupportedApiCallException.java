package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zzbj;

    public UnsupportedApiCallException(Feature feature) {
        this.zzbj = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.zzbj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}