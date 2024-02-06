package com.scb.phone.view.activity.chequemanagement.activatecheque;

import android.os.Bundle;
import com.scb.phone.view.activity.chequemanagement.ChequeReviewActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.ConstructorConstructor;
import p040o.HmlPinActivity;
import p040o.copyEntry;
import p040o.getUuidUtf8Bytes;
import p040o.setUuidFromUtf8Bytes;

public class ActivateChequeReviewActivity extends ChequeReviewActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    @HmlPinActivity
    public ConstructorConstructor.C320012 presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        ConstructorConstructor.C320012 r0 = this.presenter;
        if (!r0.MediaBrowserCompat$ItemReceiver) {
            boolean z = true;
            r0.MediaBrowserCompat$ItemReceiver = true;
            if (r0.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r0.RatingCompat.AlertController$RecycleListView();
            }
            copyEntry IconCompatParcelizer = copyEntry.IconCompatParcelizer();
            IconCompatParcelizer.write = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
            r0.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer);
            r0.IconCompatParcelizer.IconCompatParcelizer(new ConstructorConstructor.C320012.read(setuuidfromutf8bytes));
        }
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        super.IconCompatParcelizer(getuuidutf8bytes);
    }
}
