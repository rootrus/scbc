package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.hml.HmlETBSummaryActivity;
import p040o.HmlPinActivity;
import p040o.PassportCaptureModule_GetProcessingParametersFactory;
import p040o.TabLayout;
import p040o.getICheckDeserializerRtti;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setErrorInfo;
import p040o.setErrorInfo$MediaBrowserCompat$ItemReceiver;
import p040o.zzct;

public final class HmlBusinessOwnerSummaryDeepLinkActivity extends HmlBaseDeepLinkActivity implements PassportCaptureModule_GetProcessingParametersFactory {
    @HmlPinActivity
    public setErrorInfo presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        setErrorInfo seterrorinfo = this.presenter;
        if (seterrorinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seterrorinfo.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        setErrorInfo seterrorinfo = this.presenter;
        if (seterrorinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (seterrorinfo.RatingCompat != null) {
            seterrorinfo.RatingCompat.AlertController$RecycleListView();
        }
        TabLayout tabLayout = seterrorinfo.MediaBrowserCompat$ItemReceiver;
        zzct.zza zza = zzct.zza.BUSINESS_OWNER;
        onGetStartedClick.write((Object) zza, "type");
        tabLayout.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza);
        seterrorinfo.write.MediaBrowserCompat$ItemReceiver(new setErrorInfo.read(seterrorinfo), new setErrorInfo$MediaBrowserCompat$ItemReceiver(seterrorinfo), new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), seterrorinfo.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$MediaItem() {
        HmlETBSummaryActivity.read read = HmlETBSummaryActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent putExtra = new Intent(context, HmlETBSummaryActivity.class).putExtra("com.scb.phone.EXTRA_LOAN_PERSONALIZATION_SECTION", true);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlETBSu…anPersonalizationSection)");
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        String str = null;
        putExtra.putExtra("utm_campaign", extras != null ? extras.getString("utm_campaign") : null);
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        putExtra.putExtra("utm_content", extras2 != null ? extras2.getString("utm_content") : null);
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras3 = intent3.getExtras();
        putExtra.putExtra("utm_source", extras3 != null ? extras3.getString("utm_source") : null);
        Intent intent4 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent4, "intent");
        Bundle extras4 = intent4.getExtras();
        putExtra.putExtra("utm_medium", extras4 != null ? extras4.getString("utm_medium") : null);
        Intent intent5 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent5, "intent");
        Bundle extras5 = intent5.getExtras();
        if (extras5 != null) {
            str = extras5.getString("utm_content");
        }
        putExtra.putExtra("intent", getICheckDeserializerRtti.write(str));
        read(putExtra);
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }
}
