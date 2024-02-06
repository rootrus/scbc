package com.scb.phone.view.activity.fastpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getTopLeftCornerWidth;
import p040o.getUuidUtf8Bytes;
import p040o.nativeWritePngImage;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class FastPayBillPaymentReviewActivity extends ReviewActivity implements getTopLeftCornerWidth.RatingCompat {
    private String MediaBrowserCompat$MediaItem;
    private String MediaMetadataCompat;
    @HmlPinActivity
    public nativeWritePngImage fastPayBillPaymentReviewPresenter;

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.MediaBrowserCompat$MediaItem = read("source", "");
        this.MediaMetadataCompat = read("subtype", "");
        this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_START", "billpay_review"), new ZSYR2K("source", this.MediaBrowserCompat$MediaItem), new ZSYR2K("subtype", this.MediaMetadataCompat));
        this.fastPayBillPaymentReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onDestroy() {
        this.fastPayBillPaymentReviewPresenter.onDestroy();
        super.onDestroy();
    }

    public final String MediaSessionCompat$QueueItem() {
        String string = getIntent().getExtras().getString("com.scb.phone.TransferTabFragment.REVIEW_TITLE");
        if (string != null && !string.isEmpty()) {
            return string;
        }
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        return getString((setuuidfromutf8bytes == null || setuuidfromutf8bytes.setShowingForActionMode == null) ? R.string.billpayment_review_title : R.string.billpayment_review_001);
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.fastPayBillPaymentReviewPresenter.write(setuuidfromutf8bytes);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_REFRESH_SOURCE_ACCOUNTS");
        sendBroadcast(intent);
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_FINISH", "billpay_slip"), new ZSYR2K("source", this.MediaBrowserCompat$MediaItem), new ZSYR2K("subtype", this.MediaMetadataCompat));
        Intent intent = new Intent(this, FastPaySuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        this.MediaBrowserCompat$MediaItem = "";
        if (getIntent().getStringExtra("source") != null) {
            this.MediaBrowserCompat$MediaItem = getIntent().getStringExtra("source");
        }
        intent.putExtra("source", this.MediaBrowserCompat$MediaItem);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        MediaSessionCompat$ResultReceiverWrapper();
        aj_();
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        if (setuuidfromutf8bytes != null && setuuidfromutf8bytes.setIcon) {
            Intent intent2 = new Intent();
            intent2.setAction("com.scb.phone/BROADCAST_ADD_TILE_TO_ROOT");
            sendBroadcast(intent2);
        }
    }
}
