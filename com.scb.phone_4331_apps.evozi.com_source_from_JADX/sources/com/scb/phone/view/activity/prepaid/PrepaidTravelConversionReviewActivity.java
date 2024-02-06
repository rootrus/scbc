package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewCommonActivity;
import com.scb.phone.view.activity.prepaid.PrepaidTravelConversionSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4776hn;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.checkElementIndex$MediaBrowserCompat$ItemReceiver;
import p040o.checkElementNotNull;
import p040o.getKernelIDDstAtop;
import p040o.hn$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.listIteratorImpl;
import p040o.onGetStartedClick;
import p040o.setDiskSpace;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PrepaidTravelConversionReviewActivity extends ReviewCommonActivity implements LocalProjectProvider$b$MediaBrowserCompat$ItemReceiver {
    public static final C5695xef24dc42 MediaMetadataCompat = new C5695xef24dc42((byte) 0);
    private boolean MediaBrowserCompat$MediaItem;
    private getKernelIDDstAtop MediaBrowserCompat$SearchResultReceiver;
    private setDiskSpace MediaDescriptionCompat;
    @HmlPinActivity
    public C4776hn presenter;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo13826x50fd9e4a() {
        return "";
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        this.MediaBrowserCompat$MediaItem = getIntent().getBooleanExtra("EXTRA_IS_BUY", false);
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        this.MediaDescriptionCompat = extras != null ? (setDiskSpace) extras.getParcelable("EXTRA_CONVERSION_VERIFICATION") : null;
        super.onCreate(bundle);
        this.MediaBrowserCompat$SearchResultReceiver = new getKernelIDDstAtop();
        C4776hn hnVar = this.presenter;
        if (hnVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hnVar.MediaBrowserCompat$ItemReceiver(this);
        setDiskSpace setdiskspace = this.MediaDescriptionCompat;
        if (setdiskspace != null) {
            C4776hn hnVar2 = this.presenter;
            if (hnVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) setdiskspace, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            hnVar2.write = hnVar2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(setdiskspace);
            writeUInt64NoTag.IconCompatParcelizer write = new C4776hn.write(hnVar2);
            if (hnVar2.RatingCompat != null) {
                write.IconCompatParcelizer(hnVar2.RatingCompat);
            }
        }
        C4776hn hnVar3 = this.presenter;
        if (hnVar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (this.MediaBrowserCompat$MediaItem) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4776hn.IconCompatParcelizer.read;
            if (hnVar3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(hnVar3.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C4776hn.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
            if (hnVar3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(hnVar3.RatingCompat);
            }
        }
        if (this.MediaBrowserCompat$MediaItem) {
            getKernelIDDstAtop getkerneliddstatop = this.MediaBrowserCompat$SearchResultReceiver;
            if (getkerneliddstatop == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
            }
            getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_conversion_buy_review_screen");
            return;
        }
        getKernelIDDstAtop getkerneliddstatop2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (getkerneliddstatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_conversion_sell_review_screen");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaSessionCompat$QueueItem(getString(R.string.prepaid_conversion_review_buy_title));
    }

    public final void read() {
        MediaSessionCompat$QueueItem(getString(R.string.prepaid_conversion_review_sell_title));
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        setDiskSpace setdiskspace = this.MediaDescriptionCompat;
        if (setdiskspace != null) {
            String str = this.MediaBrowserCompat$MediaItem ? "planetscb_buy_confirm" : "planetscb_sell_confirm";
            getKernelIDDstAtop getkerneliddstatop = this.MediaBrowserCompat$SearchResultReceiver;
            if (getkerneliddstatop == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
            }
            getkerneliddstatop.read("source", str);
            getKernelIDDstAtop getkerneliddstatop2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (getkerneliddstatop2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
            }
            getkerneliddstatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_conversion_confirm");
            C4776hn hnVar = this.presenter;
            if (hnVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            boolean z = this.MediaBrowserCompat$MediaItem;
            onGetStartedClick.write((Object) setdiskspace, "verification");
            if (hnVar.RatingCompat != null) {
                hnVar.RatingCompat.AlertController$RecycleListView();
            }
            checkElementNotNull checkelementnotnull = new checkElementNotNull(setdiskspace.RatingCompat);
            listIteratorImpl listiteratorimpl = hnVar.read;
            FundFactSheetActivity read = new C4776hn.read(hnVar, z);
            FundFactSheetActivity hn_mediabrowsercompat_customactionresultreceiver = new hn$MediaBrowserCompat$CustomActionResultReceiver(hnVar);
            onGetStartedClick.write((Object) read, "onSuccess");
            onGetStartedClick.write((Object) hn_mediabrowsercompat_customactionresultreceiver, "onError");
            onGetStartedClick.write((Object) checkelementnotnull, "request");
            listiteratorimpl.IconCompatParcelizer(listiteratorimpl.write, read, hn_mediabrowsercompat_customactionresultreceiver, new checkElementIndex$MediaBrowserCompat$ItemReceiver(checkelementnotnull));
        }
    }

    public final void write(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        PrepaidTravelConversionSuccessActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidTravelConversionSuccessActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        boolean z = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        Intent putExtra = new Intent(context, PrepaidTravelConversionSuccessActivity.class).putExtra("PrepaidTravelConversionSuccessActivity.KEY_SUCCESS", standardstartandwait).putExtra("EXTRA_IS_BUY", z);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidT…(EXTRA_IS_BUY, isFromBuy)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
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
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent read = PrepaidDetailsActivity.read((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void IconCompatParcelizer() {
        setResult(-1);
        finish();
    }

    public final void onDestroy() {
        C4776hn hnVar = this.presenter;
        if (hnVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hnVar.onDestroy();
        super.onDestroy();
    }
}
