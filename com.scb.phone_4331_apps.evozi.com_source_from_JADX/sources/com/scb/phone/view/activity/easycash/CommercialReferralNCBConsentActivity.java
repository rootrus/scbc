package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.data.network.service.TileService;
import com.scb.phone.view.fragment.easycash.EasycashSuccessDialogFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.Image;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getChannels;
import p040o.getExecutor;
import p040o.onGetStartedClick;
import p040o.serializeEvent;
import p040o.setTapText;

public final class CommercialReferralNCBConsentActivity extends BaseCommonNCBConsentActivity implements CheckExtractActivity_MembersInjector.MediaMetadataCompat, EasycashSuccessDialogFragment.read {
    @HmlPinActivity
    public Image.OutputColor commercialPresenter;

    public final getChannels<?> MediaSessionCompat$ResultReceiverWrapper() {
        Image.OutputColor outputColor = this.commercialPresenter;
        if (outputColor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("commercialPresenter");
        }
        return outputColor;
    }

    public static final class read {
        public TileService MediaBrowserCompat$ItemReceiver;

        private read() {
        }

        @HmlPinActivity
        public read(TileService tileService) {
            this.MediaBrowserCompat$ItemReceiver = tileService;
        }
    }

    public final void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
    }

    public final void MediaSessionCompat$Token() {
        getExecutor getexecutor;
        Image.OutputColor outputColor = this.commercialPresenter;
        if (outputColor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("commercialPresenter");
        }
        outputColor.MediaBrowserCompat$ItemReceiver(this);
        Image.OutputColor outputColor2 = this.commercialPresenter;
        if (outputColor2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("commercialPresenter");
        }
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || (getexecutor = (getExecutor) extras.getParcelable("EXTRA_REFERRAL_CONFIRMATION")) == null) {
            getexecutor = new getExecutor();
        }
        onGetStartedClick.write((Object) getexecutor, "display");
        outputColor2.MediaBrowserCompat$MediaItem = getexecutor;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(serializeEvent serializeevent) {
        onGetStartedClick.write((Object) serializeevent, "easycashSuccessDisplay");
        EasycashSuccessDialogFragment write = EasycashSuccessDialogFragment.write(serializeevent);
        CardView read2 = getSupportFragmentManager().read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "supportFragmentManager.beginTransaction()");
        write.show(read2, "dialog");
    }

    public final void MediaSessionCompat$QueueItem() {
        Intent write = EasycashCreditPowerInputActivity.write(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, write).read();
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

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14259x50fd9e4a() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }
}
