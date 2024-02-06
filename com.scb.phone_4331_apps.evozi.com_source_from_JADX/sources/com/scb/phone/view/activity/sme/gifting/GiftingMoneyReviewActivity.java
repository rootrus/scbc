package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getUuidUtf8Bytes;
import p040o.setJailbroken;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.showProgressBar;

public class GiftingMoneyReviewActivity extends ReviewActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    @HmlPinActivity
    public showProgressBar giftingMoneyReviewPresenter;

    public static void MediaBrowserCompat$ItemReceiver(Context context, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Intent intent = new Intent(context, GiftingMoneyReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        setUuidFromUtf8Bytes setuuidfromutf8bytes;
        setJailbroken setjailbroken;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.giftingMoneyReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent() != null && (setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW")) != null && (setjailbroken = setuuidfromutf8bytes.setChecked) != null && !TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$CustomActionResultReceiver)) {
            this.scbAnalytics.write("gifting_money_review", new ZSYR2K("gift_id", setjailbroken.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    public void onDestroy() {
        this.giftingMoneyReviewPresenter.onDestroy();
        super.onDestroy();
    }

    public final String MediaSessionCompat$QueueItem() {
        return getString(R.string.gifting_review_activity);
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.giftingMoneyReviewPresenter.MediaBrowserCompat$ItemReceiver(setuuidfromutf8bytes);
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        if (!(getuuidutf8bytes.PlaybackStateCompat == null || getuuidutf8bytes.PlaybackStateCompat.setChecked == null)) {
            this.scbAnalytics.write("gifting_money_slip", new ZSYR2K("gift_id", getuuidutf8bytes.PlaybackStateCompat.setChecked.MediaBrowserCompat$CustomActionResultReceiver));
        }
        super.IconCompatParcelizer(getuuidutf8bytes);
    }
}
