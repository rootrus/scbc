package com.scb.phone.view.activity.hml;

import android.widget.CompoundButton;
import p040o.onGetStartedClick;
import p040o.zzfe;

final class HmlBaseReviewActivity$MediaBrowserCompat$SearchResultReceiver implements CompoundButton.OnCheckedChangeListener {
    private /* synthetic */ HmlBaseReviewActivity write;

    HmlBaseReviewActivity$MediaBrowserCompat$SearchResultReceiver(HmlBaseReviewActivity hmlBaseReviewActivity) {
        this.write = hmlBaseReviewActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        T t = this.write.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.read(zzfe.zza.TERMS_N_CONDITIONS, z);
    }
}
