package com.scb.phone.view.activity.chequemanagement.ordercheque;

import android.os.Bundle;
import com.scb.phone.view.activity.chequemanagement.ChequeReviewActivity;
import p040o.C1155xc057a232;
import p040o.HmlPinActivity;
import p040o.copyEntry;
import p040o.getUuidUtf8Bytes;
import p040o.setUuidFromUtf8Bytes;
import p040o.withVersion;
import p040o.withVersion$MediaBrowserCompat$ItemReceiver;

public class OrderChequeReviewActivity extends ChequeReviewActivity implements C1155xc057a232 {
    @HmlPinActivity
    public withVersion presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        withVersion withversion = this.presenter;
        if (!withversion.read) {
            boolean z = true;
            withversion.read = true;
            if (withversion.RatingCompat == null) {
                z = false;
            }
            if (z) {
                withversion.RatingCompat.AlertController$RecycleListView();
            }
            copyEntry IconCompatParcelizer = copyEntry.IconCompatParcelizer();
            IconCompatParcelizer.write = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
            withversion.MediaBrowserCompat$ItemReceiver.read(IconCompatParcelizer);
            withversion.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new withVersion$MediaBrowserCompat$ItemReceiver(withversion, setuuidfromutf8bytes));
        }
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        super.IconCompatParcelizer(getuuidutf8bytes);
    }
}
