package com.scb.phone.view.activity.hml;

import android.view.View;
import p040o.onGetStartedClick;

final class HmlBaseReviewActivity$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ HmlBaseReviewActivity write;

    HmlBaseReviewActivity$MediaBrowserCompat$ItemReceiver(HmlBaseReviewActivity hmlBaseReviewActivity) {
        this.write = hmlBaseReviewActivity;
    }

    public final void onClick(View view) {
        T t = this.write.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
