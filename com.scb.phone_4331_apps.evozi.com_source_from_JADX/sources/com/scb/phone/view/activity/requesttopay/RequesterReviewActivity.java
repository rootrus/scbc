package com.scb.phone.view.activity.requesttopay;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import p040o.AlertController$RecycleListView;
import p040o.C4961mY;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.getDocumentFramingError$MediaBrowserCompat$MediaItem;
import p040o.getUuidUtf8Bytes;
import p040o.setUuidFromUtf8Bytes;
import p040o.sortEntries;

public class RequesterReviewActivity extends ReviewActivity implements getDocumentFramingError$MediaBrowserCompat$MediaItem {
    @HmlPinActivity
    public C4961mY requesterReviewPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.requesterReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.scbAnalytics.write("rtp_review", new ZSYR2K("source", read("source", "")), new ZSYR2K("subtype", "outgoing"));
    }

    public final String MediaSessionCompat$QueueItem() {
        return getString(R.string.request_to_pay_review);
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        C4961mY mYVar = this.requesterReviewPresenter;
        if (!mYVar.write) {
            boolean z = true;
            mYVar.write = true;
            if (mYVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mYVar.RatingCompat.AlertController$RecycleListView();
            }
            sortEntries read = sortEntries.read();
            read.write = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
            mYVar.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(read);
            mYVar.IconCompatParcelizer.IconCompatParcelizer(new C4961mY.IconCompatParcelizer(mYVar, (byte) 0));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        super.MediaBrowserCompat$CustomActionResultReceiver(access_2200);
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        this.requesterReviewPresenter.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver();
        super.IconCompatParcelizer(getuuidutf8bytes);
        this.scbAnalytics.write("rtp_slip", new ZSYR2K("source", read("source", "")), new ZSYR2K("subtype", "outgoing"));
        finish();
    }

    public void onDestroy() {
        this.requesterReviewPresenter.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver();
        super.onDestroy();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.requesterReviewPresenter.write = false;
    }
}
