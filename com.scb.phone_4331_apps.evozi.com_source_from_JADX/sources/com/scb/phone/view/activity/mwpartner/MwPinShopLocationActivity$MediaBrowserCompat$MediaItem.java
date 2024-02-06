package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.RelativeLayout;
import com.scb.phone.R;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

final class MwPinShopLocationActivity$MediaBrowserCompat$MediaItem implements View.OnFocusChangeListener {
    private /* synthetic */ MwPinShopLocationActivity MediaBrowserCompat$ItemReceiver;

    MwPinShopLocationActivity$MediaBrowserCompat$MediaItem(MwPinShopLocationActivity mwPinShopLocationActivity) {
        this.MediaBrowserCompat$ItemReceiver = mwPinShopLocationActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            RelativeLayout relativeLayout = this.MediaBrowserCompat$ItemReceiver.layoutSearchEditText;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchEditText");
            }
            relativeLayout.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.shape_purple_border_rounded_rectangle));
            return;
        }
        RelativeLayout relativeLayout2 = this.MediaBrowserCompat$ItemReceiver.layoutSearchEditText;
        if (relativeLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchEditText");
        }
        relativeLayout2.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.shape_gray_rounded_rectangle));
    }
}
