package com.scb.phone.view.activity.transferandpay.topup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import p040o.AlertController$RecycleListView;
import p040o.C9980xe36c8520;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.getProcessingParameters;
import p040o.getTopLeftCornerWidth;
import p040o.getUuidUtf8Bytes;
import p040o.setUuidFromUtf8Bytes;

public class TopUpReviewActivity extends ReviewActivity implements getTopLeftCornerWidth.setPopupCallback {
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public getProcessingParameters topUpReviewPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.MediaBrowserCompat$SearchResultReceiver = read("source", "");
        String read = read("subtype", "");
        this.MediaBrowserCompat$MediaItem = read;
        if (TextUtils.isEmpty(read)) {
            this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_START", "topup_review"), new ZSYR2K("source", this.MediaBrowserCompat$SearchResultReceiver));
        } else {
            this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_START", "topup_review"), new ZSYR2K("source", this.MediaBrowserCompat$SearchResultReceiver), new ZSYR2K("subtype", this.MediaBrowserCompat$MediaItem));
        }
        this.topUpReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onDestroy() {
        this.topUpReviewPresenter.onDestroy();
        super.onDestroy();
    }

    public String MediaSessionCompat$QueueItem() {
        String string = getIntent().getExtras().getString("com.scb.phone.TransferTabFragment.REVIEW_TITLE");
        if (string != null && !string.isEmpty()) {
            return string;
        }
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        return getString((setuuidfromutf8bytes == null || setuuidfromutf8bytes.setShowingForActionMode == null) ? R.string.top_up_review : R.string.topup_review_001);
    }

    public void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        getProcessingParameters getprocessingparameters = this.topUpReviewPresenter;
        if (!getprocessingparameters.IconCompatParcelizer) {
            boolean z = true;
            getprocessingparameters.IconCompatParcelizer = true;
            if (getprocessingparameters.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getprocessingparameters.RatingCompat.AlertController$RecycleListView();
            }
            if (setuuidfromutf8bytes.setIcon) {
                getprocessingparameters.MediaBrowserCompat$ItemReceiver.read(getprocessingparameters.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes));
            } else {
                getprocessingparameters.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(getprocessingparameters.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes));
            }
            getprocessingparameters.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C9980xe36c8520(getprocessingparameters, (byte) 0));
        }
    }

    public void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        if (TextUtils.isEmpty(this.MediaBrowserCompat$MediaItem)) {
            this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_FINISH", "topup_slip"), new ZSYR2K("source", this.MediaBrowserCompat$SearchResultReceiver));
        } else {
            this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_FINISH", "topup_slip"), new ZSYR2K("source", this.MediaBrowserCompat$SearchResultReceiver), new ZSYR2K("subtype", this.MediaBrowserCompat$MediaItem));
        }
        super.IconCompatParcelizer(getuuidutf8bytes);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_REFRESH_SOURCE_ACCOUNTS");
        sendBroadcast(intent);
    }
}
