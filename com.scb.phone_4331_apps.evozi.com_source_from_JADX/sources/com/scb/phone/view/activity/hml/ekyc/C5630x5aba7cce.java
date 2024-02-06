package com.scb.phone.view.activity.hml.ekyc;

import android.content.DialogInterface;
import p040o.getBackendType;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.hml.ekyc.HmlNTBeKYCLandingActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5630x5aba7cce implements DialogInterface.OnClickListener {
    private /* synthetic */ HmlNTBeKYCLandingActivity IconCompatParcelizer;

    C5630x5aba7cce(HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity) {
        this.IconCompatParcelizer = hmlNTBeKYCLandingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getBackendType getbackendtype = this.IconCompatParcelizer.presenter;
        if (getbackendtype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getbackendtype.RatingCompat != null) {
            getbackendtype.RatingCompat.AlertController$RecycleListView();
        }
        getbackendtype.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        getbackendtype.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getBackendType.MediaMetadataCompat(getbackendtype));
    }
}
