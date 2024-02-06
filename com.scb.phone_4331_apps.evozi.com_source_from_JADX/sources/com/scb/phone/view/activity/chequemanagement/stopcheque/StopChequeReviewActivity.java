package com.scb.phone.view.activity.chequemanagement.stopcheque;

import android.os.Bundle;
import com.scb.phone.view.activity.chequemanagement.ChequeReviewActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.LinkedTreeMap;
import p040o.LinkedTreeMap$MediaBrowserCompat$ItemReceiver;
import p040o.copyEntry;
import p040o.getUuidUtf8Bytes;
import p040o.setUuidFromUtf8Bytes;

public class StopChequeReviewActivity extends ChequeReviewActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.RatingCompat {
    @HmlPinActivity
    public LinkedTreeMap presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        LinkedTreeMap linkedTreeMap = this.presenter;
        if (!linkedTreeMap.MediaBrowserCompat$ItemReceiver) {
            boolean z = true;
            linkedTreeMap.MediaBrowserCompat$ItemReceiver = true;
            if (linkedTreeMap.RatingCompat == null) {
                z = false;
            }
            if (z) {
                linkedTreeMap.RatingCompat.AlertController$RecycleListView();
            }
            copyEntry IconCompatParcelizer = copyEntry.IconCompatParcelizer();
            IconCompatParcelizer.write = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
            linkedTreeMap.IconCompatParcelizer.write(IconCompatParcelizer);
            linkedTreeMap.IconCompatParcelizer.IconCompatParcelizer(new LinkedTreeMap$MediaBrowserCompat$ItemReceiver(linkedTreeMap, setuuidfromutf8bytes));
        }
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        super.IconCompatParcelizer(getuuidutf8bytes);
    }
}
