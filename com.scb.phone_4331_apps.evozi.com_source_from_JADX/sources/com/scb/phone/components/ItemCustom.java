package com.scb.phone.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p040o.ForwardingFuture;

public abstract class ItemCustom<D extends ForwardingFuture> extends FrameLayout {
    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(Context context);

    public abstract void setUpWithDisplay(D d);

    public ItemCustom(Context context) {
        this(context, (AttributeSet) null);
    }

    public ItemCustom(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$CustomActionResultReceiver(context);
    }
}
