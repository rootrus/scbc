package com.scb.phone.view.custom.item;

import android.content.Context;
import android.view.View;
import butterknife.BindView;
import p040o.ForwardingFuture;
import p040o.HmlPinActivity;
import p040o.callTask;
import p040o.onGetStartedClick;

public final class ItemRevampSeparatorCustom extends ItemSeparatorCustom {
    @BindView
    protected View viewFullSeparator;
    @BindView
    protected View viewSeparator;

    public final /* bridge */ /* synthetic */ void setUpWithDisplay(ForwardingFuture forwardingFuture) {
        setUpWithDisplay((callTask) forwardingFuture);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ItemRevampSeparatorCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setUpWithDisplay(callTask calltask) {
        boolean z;
        super.setUpWithDisplay(calltask);
        if (calltask != null) {
            z = calltask.MediaBrowserCompat$ItemReceiver;
        } else {
            z = false;
        }
        if (z) {
            View view = this.viewSeparator;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewSeparator");
            }
            view.setVisibility(8);
            View view2 = this.viewFullSeparator;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewFullSeparator");
            }
            view2.setVisibility(0);
        }
    }
}
