package com.scb.phone.view.fragment.prepaid.activation;

import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import p040o.C4773hl;
import p040o.onGetStartedClick;

public final class PrepaidActivationInputFragment$MediaBrowserCompat$ItemReceiver extends ViewPager$MediaBrowserCompat$MediaItem {
    private /* synthetic */ PrepaidActivationInputFragment IconCompatParcelizer;

    PrepaidActivationInputFragment$MediaBrowserCompat$ItemReceiver(PrepaidActivationInputFragment prepaidActivationInputFragment) {
        this.IconCompatParcelizer = prepaidActivationInputFragment;
    }

    public final void onPageSelected(int i) {
        C4773hl hlVar = this.IconCompatParcelizer.presenter;
        if (hlVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hlVar.MediaBrowserCompat$ItemReceiver = hlVar.IconCompatParcelizer.get(i);
    }
}
