package com.scb.phone.view.activity.bscanc;

import android.view.View;
import p040o.C3378x49c8faa1;
import p040o.FirebaseInstanceId;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class MyQRMenuActivity$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ MyQRMenuActivity MediaBrowserCompat$CustomActionResultReceiver;

    MyQRMenuActivity$MediaBrowserCompat$ItemReceiver(MyQRMenuActivity myQRMenuActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = myQRMenuActivity;
    }

    public final void onClick(View view) {
        MyQRMenuActivity myQRMenuActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        myQRMenuActivity.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(myQRMenuActivity.scbAnalytics, "Lifestyle_qr_belt_create");
        FirebaseInstanceId.zza zza = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3378x49c8faa1.MediaBrowserCompat$CustomActionResultReceiver;
        if (zza.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(zza.RatingCompat);
        }
    }
}
