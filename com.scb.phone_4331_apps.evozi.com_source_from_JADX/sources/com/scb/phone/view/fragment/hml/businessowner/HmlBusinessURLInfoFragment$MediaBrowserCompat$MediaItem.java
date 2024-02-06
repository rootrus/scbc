package com.scb.phone.view.fragment.hml.businessowner;

import com.scb.phone.view.custom.common.CommonInputViewGroup$MediaBrowserCompat$ItemReceiver;

final class HmlBusinessURLInfoFragment$MediaBrowserCompat$MediaItem implements CommonInputViewGroup$MediaBrowserCompat$ItemReceiver {
    private /* synthetic */ HmlBusinessURLInfoFragment IconCompatParcelizer;

    HmlBusinessURLInfoFragment$MediaBrowserCompat$MediaItem(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
        this.IconCompatParcelizer = hmlBusinessURLInfoFragment;
    }

    public final void read() {
        HmlBusinessURLInfoFragment.write(this.IconCompatParcelizer);
    }
}
