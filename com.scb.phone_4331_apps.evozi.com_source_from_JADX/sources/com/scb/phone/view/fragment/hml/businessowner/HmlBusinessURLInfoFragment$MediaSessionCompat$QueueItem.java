package com.scb.phone.view.fragment.hml.businessowner;

import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

public final class HmlBusinessURLInfoFragment$MediaSessionCompat$QueueItem implements TabLayout$MediaBrowserCompat$ItemReceiver {
    private /* synthetic */ HmlBusinessURLInfoFragment read;

    HmlBusinessURLInfoFragment$MediaSessionCompat$QueueItem(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
        this.read = hmlBusinessURLInfoFragment;
    }

    public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer == null || iconCompatParcelizer.read != 0) {
            LinearLayout linearLayout = this.read.storeUrlLayout;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeUrlLayout");
            }
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.read.productUrlLayout;
            if (linearLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productUrlLayout");
            }
            linearLayout2.setVisibility(0);
            return;
        }
        LinearLayout linearLayout3 = this.read.storeUrlLayout;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeUrlLayout");
        }
        linearLayout3.setVisibility(0);
        LinearLayout linearLayout4 = this.read.productUrlLayout;
        if (linearLayout4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productUrlLayout");
        }
        linearLayout4.setVisibility(8);
    }
}
