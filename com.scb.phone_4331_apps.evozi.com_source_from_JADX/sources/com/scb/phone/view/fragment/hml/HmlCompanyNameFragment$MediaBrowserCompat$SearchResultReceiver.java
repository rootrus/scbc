package com.scb.phone.view.fragment.hml;

import androidx.recyclerview.widget.RecyclerView;
import p040o.ExtractionParameters;
import p040o.getUserEmailAddress;
import p040o.onGetStartedClick;

public final class HmlCompanyNameFragment$MediaBrowserCompat$SearchResultReceiver extends RecyclerView.ParcelableVolumeInfo {
    private /* synthetic */ HmlCompanyNameFragment MediaBrowserCompat$ItemReceiver;

    HmlCompanyNameFragment$MediaBrowserCompat$SearchResultReceiver(HmlCompanyNameFragment hmlCompanyNameFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlCompanyNameFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i) {
        String str;
        onGetStartedClick.write((Object) recyclerView, "recyclerView");
        super.MediaBrowserCompat$ItemReceiver(recyclerView, i);
        if (!recyclerView.canScrollVertically(1)) {
            if (!this.MediaBrowserCompat$ItemReceiver.RatingCompat) {
                getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (getuseremailaddress == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                if (getuseremailaddress.write && (str = getuseremailaddress.MediaDescriptionCompat) != null) {
                    getuseremailaddress.read(str, false);
                }
            }
            HmlCompanyNameFragment hmlCompanyNameFragment = this.MediaBrowserCompat$ItemReceiver;
            hmlCompanyNameFragment.RatingCompat = true ^ hmlCompanyNameFragment.RatingCompat;
        }
    }
}
