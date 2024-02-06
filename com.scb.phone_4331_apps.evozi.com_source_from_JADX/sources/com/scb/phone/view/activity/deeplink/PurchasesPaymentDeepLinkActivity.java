package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.ccsof.CcSofCreditCardOnlyActivity;
import com.scb.phone.view.activity.ccsof.CcSofCreditCardOnlyActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.ccsof.CcSofHybridActivity;
import com.scb.phone.view.activity.partner.PartnerBillPaymentInputActivity;
import p040o.CaptureGuidance;
import p040o.CaptureGuidance$GuidanceSource$MediaBrowserCompat$ItemReceiver;
import p040o.CrashlyticsReport;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.Lists;
import p040o.computeNext$MediaBrowserCompat$ItemReceiver;
import p040o.injectOnDeviceExceptionDeserializer;
import p040o.lambda$processSetComponents$1;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class PurchasesPaymentDeepLinkActivity extends BaseDeepLinkActivity implements injectOnDeviceExceptionDeserializer {
    @HmlPinActivity
    public CaptureGuidance.GuidanceSource presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        CaptureGuidance.GuidanceSource guidanceSource = this.presenter;
        if (guidanceSource == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        guidanceSource.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = intent.getStringExtra("callback_url");
        CaptureGuidance.GuidanceSource guidanceSource2 = this.presenter;
        if (guidanceSource2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        guidanceSource2.MediaBrowserCompat$ItemReceiver = stringExtra;
        boolean z = true;
        if (str != null) {
            if (guidanceSource2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                guidanceSource2.RatingCompat.AlertController$RecycleListView();
            }
            Lists.Partition partition = guidanceSource2.read;
            CaptureGuidance.GuidanceSource guidanceSource3 = guidanceSource2;
            FundFactSheetActivity captureGuidance$GuidanceSource$MediaBrowserCompat$ItemReceiver = new CaptureGuidance$GuidanceSource$MediaBrowserCompat$ItemReceiver(guidanceSource3);
            FundFactSheetActivity iconCompatParcelizer = new CaptureGuidance.GuidanceSource.IconCompatParcelizer(guidanceSource3);
            onGetStartedClick.write((Object) str, "deepLinkId");
            onGetStartedClick.write((Object) captureGuidance$GuidanceSource$MediaBrowserCompat$ItemReceiver, "onSuccess");
            onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
            partition.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(captureGuidance$GuidanceSource$MediaBrowserCompat$ItemReceiver, iconCompatParcelizer, new computeNext$MediaBrowserCompat$ItemReceiver(str), partition.MediaBrowserCompat$ItemReceiver);
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = CaptureGuidance.GuidanceSource.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
        if (guidanceSource2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(guidanceSource2.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, String str, String str2) {
        onGetStartedClick.write((Object) exception, "display");
        read(PartnerBillPaymentInputActivity.read(this, exception, str, str2));
    }

    public final void MediaBrowserCompat$ItemReceiver(lambda$processSetComponents$1 lambda_processsetcomponents_1, String str) {
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "display");
        CcSofCreditCardOnlyActivity$MediaBrowserCompat$ItemReceiver ccSofCreditCardOnlyActivity$MediaBrowserCompat$ItemReceiver = CcSofCreditCardOnlyActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        Intent putExtra = new Intent(context, CcSofCreditCardOnlyActivity.class).putExtra("EXTRA_PURCHASE_SOURCE_FUND_DISPLAY", lambda_processsetcomponents_1).putExtra("EXTRA_CALLBACK_URL", str);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, CcSofCre…ALLBACK_URL, callbackUrl)");
        read(putExtra);
    }

    public final void IconCompatParcelizer(lambda$processSetComponents$1 lambda_processsetcomponents_1, String str, String str2) {
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "display");
        CcSofHybridActivity.read read = CcSofHybridActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        Intent putExtra = new Intent(context, CcSofHybridActivity.class).putExtra("EXTRA_PURCHASE_SOURCE_FUND_DISPLAY", lambda_processsetcomponents_1).putExtra("EXTRA_CALLBACK_URL", str).putExtra("EXTRA_BILL_PAYMENT_SUBTYPE", str2);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, CcSofHyb…SUBTYPE, firebaseSubType)");
        read(putExtra);
    }
}
