package com.scb.phone.view.activity.requesttopay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import p040o.AlertController$RecycleListView;
import p040o.C10062n;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.attachInfo;
import p040o.getDocumentFramingError;
import p040o.getUuidUtf8Bytes;
import p040o.n$1$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setUuidFromUtf8Bytes;
import p040o.unsafeComparator;

public class PayerReviewActivity extends ReviewActivity implements getDocumentFramingError.RatingCompat {
    @HmlPinActivity
    public C10062n.C49941 payerReviewPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        read("source", "");
        this.scbAnalytics.write("rtp_review", new ZSYR2K("source", read("source", "")), new ZSYR2K("subtype", "incoming"));
        this.payerReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final String MediaSessionCompat$QueueItem() {
        return getString(R.string.request_to_pay_review_payment);
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        C10062n.C49941 r0 = this.payerReviewPresenter;
        if (!r0.IconCompatParcelizer) {
            boolean z = true;
            r0.IconCompatParcelizer = true;
            if (r0.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r0.RatingCompat.AlertController$RecycleListView();
            }
            r0.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes.MediaDescriptionCompat();
            attachInfo attachinfo = r0.read;
            unsafeComparator MediaBrowserCompat$ItemReceiver = unsafeComparator.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
            attachinfo.write(MediaBrowserCompat$ItemReceiver);
            r0.read.IconCompatParcelizer(new n$1$MediaBrowserCompat$CustomActionResultReceiver(r0));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        super.MediaBrowserCompat$CustomActionResultReceiver(access_2200);
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        setResult(-1, new Intent());
        write("rtp_slip", new ZSYR2K("source", read("source", "")), new ZSYR2K("subtype", "incoming"));
        finish();
        super.IconCompatParcelizer(getuuidutf8bytes);
    }

    public void onDestroy() {
        this.payerReviewPresenter.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        super.onDestroy();
    }
}
