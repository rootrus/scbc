package com.scb.phone.view.activity.transferandpay.billpayment;

import android.app.Activity;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import p040o.AlertController$RecycleListView;
import p040o.C7433sH;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedSet;
import p040o.getTopLeftCornerWidth;
import p040o.sH$MediaBrowserCompat$ItemReceiver;
import p040o.setUuidFromUtf8Bytes;

public class RtpEBillPaymentReviewActivity extends ReviewActivity implements getTopLeftCornerWidth.setChecked {
    @HmlPinActivity
    public C7433sH rtpEBillPaymentReviewPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.rtpEBillPaymentReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onDestroy() {
        this.rtpEBillPaymentReviewPresenter.onDestroy();
        super.onDestroy();
    }

    public final String MediaSessionCompat$QueueItem() {
        return getString(R.string.money_action_bill_payment);
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        AlertController$RecycleListView();
        C7433sH sHVar = this.rtpEBillPaymentReviewPresenter;
        if (!sHVar.write) {
            boolean z = true;
            sHVar.write = true;
            sHVar.IconCompatParcelizer = setuuidfromutf8bytes;
            if (sHVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                sHVar.RatingCompat.AlertController$RecycleListView();
            }
            ImmutableSortedSet.Builder MediaBrowserCompat$ItemReceiver = ImmutableSortedSet.Builder.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
            sHVar.read.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver);
            sHVar.read.IconCompatParcelizer(new sH$MediaBrowserCompat$ItemReceiver(sHVar, (byte) 0));
        }
    }
}
