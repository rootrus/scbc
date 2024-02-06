package com.scb.phone.view.activity.transferandpay.billpayment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentReviewFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C5082o;
import p040o.C7423ry;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getTopLeftCornerWidth;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class BillPaymentReviewActivity extends ReviewActivity implements getTopLeftCornerWidth.RatingCompat {
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaMetadataCompat;
    @HmlPinActivity
    public C5082o.C5084a billPaymentReviewPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.MediaMetadataCompat = read("source", "");
        this.MediaBrowserCompat$SearchResultReceiver = read("subtype", "");
        boolean z = false;
        this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_START", "billpay_review"), new ZSYR2K("source", this.MediaMetadataCompat), new ZSYR2K("subtype", this.MediaBrowserCompat$SearchResultReceiver));
        this.billPaymentReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5082o.C5084a aVar = this.billPaymentReviewPresenter;
        C7423ry ryVar = new C7423ry((setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW"));
        if (aVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            ryVar.IconCompatParcelizer(aVar.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, BillPaymentReviewFragment.write(setuuidfromutf8bytes), "REVIEW_FRAGMENT_TAG").write();
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
        this.billPaymentReviewPresenter.write(setuuidfromutf8bytes);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_REFRESH_SOURCE_ACCOUNTS");
        sendBroadcast(intent);
    }

    public void onDestroy() {
        this.billPaymentReviewPresenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_FINISH", "billpay_slip"), new ZSYR2K("source", this.MediaMetadataCompat), new ZSYR2K("subtype", this.MediaBrowserCompat$SearchResultReceiver));
        Intent intent = new Intent(this, BillPaymentSuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        String str = "";
        if (getIntent().getStringExtra("source") != null) {
            String stringExtra = getIntent().getStringExtra("source");
            if (!read("subtype", str).isEmpty()) {
                intent.putExtra("subtype", getIntent().getStringExtra("subtype"));
            }
            str = stringExtra;
        }
        intent.putExtra("source", str);
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
        aj_();
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        if (setuuidfromutf8bytes != null && setuuidfromutf8bytes.setIcon) {
            Intent intent2 = new Intent();
            intent2.setAction("com.scb.phone/BROADCAST_ADD_TILE_TO_ROOT");
            sendBroadcast(intent2);
        }
    }
}
