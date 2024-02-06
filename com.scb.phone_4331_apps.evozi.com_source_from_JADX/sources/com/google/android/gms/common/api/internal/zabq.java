package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {
    private Context mContext;
    private final zabp zajl;

    public zabq(zabp zabp) {
        this.zajl = zabp;
    }

    public final void zac(Context context) {
        this.mContext = context;
    }

    public final void unregister() {
        synchronized (this) {
            if (this.mContext != null) {
                this.mContext.unregisterReceiver(this);
            }
            this.mContext = null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.zajl.zas();
            unregister();
        }
    }
}
