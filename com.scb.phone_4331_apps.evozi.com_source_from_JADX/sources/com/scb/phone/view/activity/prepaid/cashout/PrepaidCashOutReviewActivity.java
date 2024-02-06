package com.scb.phone.view.activity.prepaid.cashout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewCommonActivity;
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.scb.phone.view.activity.prepaid.cashout.PrepaidCashOutSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AutoValue_CrashlyticsReport_Session_Event;
import p040o.C7514tY;
import p040o.Files;
import p040o.FundFactSheetActivity;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.ImmutableClassToInstanceMap;
import p040o.Lists;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDDstAtop;
import p040o.getNotNullImages;
import p040o.getNotNullImages$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.simpleName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PrepaidCashOutReviewActivity extends ReviewCommonActivity implements C7514tY.IconCompatParcelizer {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);
    private getKernelIDDstAtop MediaMetadataCompat;
    @HmlPinActivity
    public getNotNullImages mPresenter;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AutoValue_CrashlyticsReport_Session_Event.C30691 r6 = (AutoValue_CrashlyticsReport_Session_Event.C30691) getIntent().getParcelableExtra("EXTRA_SHOULD_DISPLAY_LOGO");
        this.MediaMetadataCompat = new getKernelIDDstAtop();
        getNotNullImages getnotnullimages = this.mPresenter;
        if (getnotnullimages == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getnotnullimages.MediaBrowserCompat$ItemReceiver(this);
        getNotNullImages getnotnullimages2 = this.mPresenter;
        if (getnotnullimages2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) r6, "prepaidCashOutReviewDisplay");
        onGetStartedClick.write((Object) r6, "prepaidCashOutReviewDisplay");
        getnotnullimages2.IconCompatParcelizer = r6;
        Files.C33642 r1 = getnotnullimages2.MediaBrowserCompat$ItemReceiver;
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = getnotnullimages2.read.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        onGetStartedClick.IconCompatParcelizer((Object) AppCompatDelegateImpl$ListMenuDecorView, "mGetUserProfileUseCase.userProfile");
        boolean z = true;
        getnotnullimages2.MediaMetadataCompat = r1.MediaBrowserCompat$CustomActionResultReceiver(r6, AppCompatDelegateImpl$ListMenuDecorView.MediaSessionCompat$ResultReceiverWrapper > 0);
        writeUInt64NoTag.IconCompatParcelizer getnotnullimages_mediabrowsercompat_itemreceiver = new getNotNullImages$MediaBrowserCompat$ItemReceiver(getnotnullimages2);
        if (getnotnullimages2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getnotnullimages_mediabrowsercompat_itemreceiver.IconCompatParcelizer(getnotnullimages2.RatingCompat);
        }
        getKernelIDDstAtop getkerneliddstatop = this.MediaMetadataCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_cashout_review_screen");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo13826x50fd9e4a() {
        String string = getString(R.string.prepaid_cash_out_review_transfer);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…cash_out_review_transfer)");
        return string;
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        getKernelIDDstAtop getkerneliddstatop = this.MediaMetadataCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_cashout_confirm");
        getNotNullImages getnotnullimages = this.mPresenter;
        if (getnotnullimages == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        AutoValue_CrashlyticsReport_Session_Event.C30691 r1 = getnotnullimages.IconCompatParcelizer;
        if (r1 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidCashOutReviewDisplay");
        }
        ImmutableClassToInstanceMap.C34971 r2 = new ImmutableClassToInstanceMap.C34971(r1.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        if (getnotnullimages.RatingCompat != null) {
            getnotnullimages.RatingCompat.AlertController$RecycleListView();
        }
        Lists.C35921 r12 = getnotnullimages.write;
        FundFactSheetActivity read = new getNotNullImages.read(getnotnullimages);
        FundFactSheetActivity iconCompatParcelizer = new getNotNullImages.IconCompatParcelizer(getnotnullimages);
        onGetStartedClick.write((Object) read, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        onGetStartedClick.write((Object) r2, "request");
        r12.IconCompatParcelizer(r12.write, read, iconCompatParcelizer, new simpleName$MediaBrowserCompat$CustomActionResultReceiver(r2));
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        PrepaidCashOutSuccessActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidCashOutSuccessActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        Intent intent = new Intent(context, PrepaidCashOutSuccessActivity.class);
        intent.putExtra("PREPAID_CASH_OUT_KEY_SUCCESS", standardstartandwait);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        setResult(-1);
        finish();
    }

    public final void IconCompatParcelizer() {
        Intent read = PrepaidDetailsActivity.read((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onDestroy() {
        getNotNullImages getnotnullimages = this.mPresenter;
        if (getnotnullimages == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getnotnullimages.onDestroy();
        super.onDestroy();
    }
}
