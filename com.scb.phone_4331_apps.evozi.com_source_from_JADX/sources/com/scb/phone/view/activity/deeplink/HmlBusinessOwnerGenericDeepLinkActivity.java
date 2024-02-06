package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.hml.C5602xb52cebc;
import com.scb.phone.view.activity.hml.C5607x23cfbb87;
import com.scb.phone.view.activity.hml.C5610xd0499873;
import com.scb.phone.view.activity.hml.HmlApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlBusinessETBPersonalInfoActivity;
import com.scb.phone.view.activity.hml.HmlBusinessOccupationInfoActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlETBLandingActivity;
import com.scb.phone.view.activity.hml.HmlETBSuccessActivity;
import com.scb.phone.view.activity.hml.businessowner.C5624xf154595d;
import com.scb.phone.view.activity.hml.businessowner.C5625x9ac9705b;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerGuidelinesActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerLoanSetupActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerReviewSubmissionActivity;
import kotlin.NoWhenBranchMatchedException;
import p040o.C7249mb;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.getErrorInfo;
import p040o.getErrorInfo$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getErrorInfo$MediaBrowserCompat$ItemReceiver;
import p040o.getICheckDeserializerRtti;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setCheckedItem;
import p040o.zzfe;
import p040o.zzjx;

public final class HmlBusinessOwnerGenericDeepLinkActivity extends HmlBaseDeepLinkActivity implements IdCaptureModule_RttiExceptionResponseDeserializer_Factory {
    @HmlPinActivity
    public getErrorInfo presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        getErrorInfo geterrorinfo = this.presenter;
        if (geterrorinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        geterrorinfo.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getErrorInfo geterrorinfo = this.presenter;
        if (geterrorinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getIntent().getStringExtra("utm_content");
        getIntent().getStringExtra("utm_campaign");
        if (geterrorinfo.RatingCompat != null) {
            geterrorinfo.RatingCompat.AlertController$RecycleListView();
        }
        geterrorinfo.IconCompatParcelizer.IconCompatParcelizer(new getErrorInfo$MediaBrowserCompat$CustomActionResultReceiver(geterrorinfo), new getErrorInfo$MediaBrowserCompat$ItemReceiver(geterrorinfo), new setCheckedItem.write(str), geterrorinfo.write);
    }

    public final void read(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }

    public final void onDestroy() {
        getErrorInfo geterrorinfo = this.presenter;
        if (geterrorinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        geterrorinfo.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getErrorInfo.write write, zzjx.zza.zzb zzb) {
        Intent intent;
        onGetStartedClick.write((Object) write, "screen");
        onGetStartedClick.write((Object) zzb, "productType");
        String str = null;
        switch (C7249mb.read[write.ordinal()]) {
            case 1:
                C5607x23cfbb87 hmlETBLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBLandingActivity.MediaBrowserCompat$MediaItem;
                intent = C5607x23cfbb87.IconCompatParcelizer(this, zzb);
                break;
            case 2:
                HmlBusinessETBPersonalInfoActivity.write write2 = HmlBusinessETBPersonalInfoActivity.MediaDescriptionCompat;
                Context context = this;
                onGetStartedClick.write((Object) context, "context");
                intent = new Intent(context, HmlBusinessETBPersonalInfoActivity.class);
                break;
            case 3:
                C5602xb52cebc hmlBusinessOccupationInfoActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOccupationInfoActivity.MediaBrowserCompat$SearchResultReceiver;
                Context context2 = this;
                onGetStartedClick.write((Object) context2, "context");
                intent = new Intent(context2, HmlBusinessOccupationInfoActivity.class);
                break;
            case 4:
                HmlBusinessOwnerGuidelinesActivity.IconCompatParcelizer iconCompatParcelizer = HmlBusinessOwnerGuidelinesActivity.MediaBrowserCompat$SearchResultReceiver;
                Context context3 = this;
                onGetStartedClick.write((Object) context3, "context");
                intent = new Intent(context3, HmlBusinessOwnerGuidelinesActivity.class);
                intent.putExtra("SHOW_BACK_POP_UP", false);
                break;
            case 5:
                HmlConsentActivity.read read = HmlConsentActivity.MediaMetadataCompat;
                intent = HmlConsentActivity.read.write(this, zzfe.zza.NCB_CONSENT, (immediateFailedFuture) null);
                break;
            case 6:
                C5625x9ac9705b hmlBusinessOwnerReviewSubmissionActivity$MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$SearchResultReceiver;
                Context context4 = this;
                onGetStartedClick.write((Object) context4, "context");
                intent = new Intent(context4, HmlBusinessOwnerReviewSubmissionActivity.class);
                break;
            case 7:
                intent = HmlApplicationOutcomeActivity.MediaBrowserCompat$CustomActionResultReceiver(this, false);
                onGetStartedClick.IconCompatParcelizer((Object) intent, "HmlApplicationOutcomeAct…createIntent(this, false)");
                break;
            case 8:
                C5624xf154595d hmlBusinessOwnerLoanSetupActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOwnerLoanSetupActivity.MediaMetadataCompat;
                Context context5 = this;
                onGetStartedClick.write((Object) context5, "ctx");
                intent = new Intent(context5, HmlBusinessOwnerLoanSetupActivity.class);
                break;
            case 9:
                C5610xd0499873 hmlETBSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBSuccessActivity.MediaMetadataCompat;
                Context context6 = this;
                onGetStartedClick.write((Object) context6, "context");
                intent = new Intent(context6, HmlETBSuccessActivity.class);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras = intent2.getExtras();
        intent.putExtra("intent", getICheckDeserializerRtti.write(extras != null ? extras.getString("utm_content") : null));
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras2 = intent3.getExtras();
        intent.putExtra("utm_campaign", extras2 != null ? extras2.getString("utm_campaign") : null);
        Intent intent4 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent4, "intent");
        Bundle extras3 = intent4.getExtras();
        intent.putExtra("utm_content", extras3 != null ? extras3.getString("utm_content") : null);
        Intent intent5 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent5, "intent");
        Bundle extras4 = intent5.getExtras();
        intent.putExtra("utm_source", extras4 != null ? extras4.getString("utm_source") : null);
        Intent intent6 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent6, "intent");
        Bundle extras5 = intent6.getExtras();
        if (extras5 != null) {
            str = extras5.getString("utm_medium");
        }
        intent.putExtra("utm_medium", str);
        read(intent);
    }
}
