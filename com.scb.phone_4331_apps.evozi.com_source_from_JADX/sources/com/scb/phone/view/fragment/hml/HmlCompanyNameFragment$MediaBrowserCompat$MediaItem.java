package com.scb.phone.view.fragment.hml;

import android.view.View;
import p040o.C4680x168d7c66;
import p040o.ExtractionParameters;
import p040o.getUserEmailAddress;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class HmlCompanyNameFragment$MediaBrowserCompat$MediaItem implements View.OnClickListener {
    private /* synthetic */ HmlCompanyNameFragment IconCompatParcelizer;

    HmlCompanyNameFragment$MediaBrowserCompat$MediaItem(HmlCompanyNameFragment hmlCompanyNameFragment) {
        this.IconCompatParcelizer = hmlCompanyNameFragment;
    }

    public final void onClick(View view) {
        getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.IconCompatParcelizer.presenter;
        if (getuseremailaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4680x168d7c66.MediaBrowserCompat$ItemReceiver;
        if (getuseremailaddress.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getuseremailaddress.RatingCompat);
        }
    }
}
