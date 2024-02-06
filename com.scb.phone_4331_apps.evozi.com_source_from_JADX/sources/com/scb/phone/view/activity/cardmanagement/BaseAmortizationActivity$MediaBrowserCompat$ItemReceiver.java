package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import p040o.onGetStartedClick;

final class BaseAmortizationActivity$MediaBrowserCompat$ItemReceiver implements Runnable {
    private /* synthetic */ BaseAmortizationActivity write;

    BaseAmortizationActivity$MediaBrowserCompat$ItemReceiver(BaseAmortizationActivity baseAmortizationActivity) {
        this.write = baseAmortizationActivity;
    }

    public final void run() {
        NestedScrollView nestedScrollView = this.write.nsvRoot;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
        }
        View childAt = nestedScrollView.getChildAt(0);
        onGetStartedClick.IconCompatParcelizer((Object) childAt, "nsvRoot.getChildAt(0)");
        int measuredHeight = childAt.getMeasuredHeight();
        NestedScrollView nestedScrollView2 = this.write.nsvRoot;
        if (nestedScrollView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
        }
        int measuredHeight2 = nestedScrollView2.getMeasuredHeight();
        NestedScrollView nestedScrollView3 = this.write.nsvRoot;
        if (nestedScrollView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
        }
        nestedScrollView3.read(0);
        NestedScrollView nestedScrollView4 = this.write.nsvRoot;
        if (nestedScrollView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
        }
        nestedScrollView4.write(0 - nestedScrollView4.getScrollX(), (measuredHeight - measuredHeight2) - nestedScrollView4.getScrollY());
    }
}
