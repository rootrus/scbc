package com.scb.phone.view.activity.requesttopay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C4959mW;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedMap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.attachInfo;
import p040o.getDocumentFramingError;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class SummaryDetailActivity extends ReviewActivity implements getDocumentFramingError.IconCompatParcelizer {
    private String MediaDescriptionCompat;
    @HmlPinActivity
    public C4959mW summaryDetailPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.MediaDescriptionCompat = read("source", "");
        this.scbAnalytics.write("rtp_input", new ZSYR2K("source", this.MediaDescriptionCompat), new ZSYR2K("subtype", "incoming"));
        this.summaryDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final String MediaSessionCompat$QueueItem() {
        return getIntent().getStringExtra("request_to_pay.SummaryDetailActivity.titleName");
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        C4959mW mWVar = this.summaryDetailPresenter;
        if (!mWVar.read) {
            boolean z = true;
            mWVar.read = true;
            if (mWVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mWVar.RatingCompat.AlertController$RecycleListView();
            }
            mWVar.write = setuuidfromutf8bytes;
            attachInfo attachinfo = mWVar.MediaBrowserCompat$ItemReceiver;
            ImmutableSortedMap.C35104 IconCompatParcelizer = ImmutableSortedMap.C35104.IconCompatParcelizer();
            IconCompatParcelizer.IconCompatParcelizer = setuuidfromutf8bytes.setSubtitle;
            attachinfo.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
            mWVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4959mW.write(mWVar, (byte) 0));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        super.MediaBrowserCompat$CustomActionResultReceiver(access_2200);
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Intent intent = new Intent(getApplicationContext(), PayerReviewActivity.class);
        setuuidfromutf8bytes.MediaMetadataCompat("rtp.payer");
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("source", this.MediaDescriptionCompat);
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
    }

    public void onNewIntent(Intent intent) {
        String stringExtra;
        super.onNewIntent(intent);
        if (intent != null && (stringExtra = intent.getStringExtra("com.scb.phone.Constants.RequestToPay.EXTRA_REQUESTER_REQ_STATUS")) != null && "COMPLETED".compareTo(stringExtra) == 0) {
            setResult(-1);
            finish();
        }
    }
}
