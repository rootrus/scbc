package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailVerificationActivity;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IdCaptureModule_OnDeviceExceptionResponseDeserializer_Factory;
import p040o.ScriptIntrinsicBLAS;
import p040o.getDocumentRectangle;
import p040o.getDocumentRectangle$MediaBrowserCompat$SearchResultReceiver;
import p040o.getIsLeftEyeOpenProbability;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class EmailVerificationAndOtpVerificationDeepLinkActivity extends BaseDeepLinkActivity implements IdCaptureModule_OnDeviceExceptionResponseDeserializer_Factory {
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public getDocumentRectangle presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    public EmailVerificationAndOtpVerificationDeepLinkActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = write.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getDocumentRectangle getdocumentrectangle = this.presenter;
        if (getdocumentrectangle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getdocumentrectangle.MediaBrowserCompat$ItemReceiver(this);
        ((ScriptIntrinsicBLAS.Uplo) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).read("feature", "email_verification");
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            ((ScriptIntrinsicBLAS.Uplo) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "inbox_noti");
        } else if (getIntent().getBooleanExtra("PUSH_TAG", false)) {
            ((ScriptIntrinsicBLAS.Uplo) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "push_noti");
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getDocumentRectangle getdocumentrectangle = this.presenter;
        if (getdocumentrectangle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getDocumentRectangle.MediaMetadataCompat.read;
        if (getdocumentrectangle.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getdocumentrectangle.RatingCompat);
        }
        getIsLeftEyeOpenProbability getislefteyeopenprobability = getdocumentrectangle.write;
        getislefteyeopenprobability.read(getislefteyeopenprobability.read(str), new getDocumentRectangle$MediaBrowserCompat$SearchResultReceiver(getdocumentrectangle), new getDocumentRectangle.MediaDescriptionCompat(getdocumentrectangle));
    }

    public final void IconCompatParcelizer() {
        read(ManageEmailLandingActivity.IconCompatParcelizer((Context) this));
    }

    public final void IconCompatParcelizer(String str, String str2) {
        read(ManageEmailVerificationActivity.IconCompatParcelizer(this, str, str2));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<ScriptIntrinsicBLAS.Uplo> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ScriptIntrinsicBLAS.Uplo();
        }
    }
}
